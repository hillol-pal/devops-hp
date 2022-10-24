FROM maven:3.6.3-jdk-11-slim AS build

# download maven dependencies
COPY pom.xml /tmp/

RUN mvn -B dependency:go-offline -f /tmp/pom.xml

# maven build
COPY src /tmp/src/
COPY .git /tmp/
WORKDIR /tmp/
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml clean package


FROM openjdk:11-jre-slim

MAINTAINER hillolster@gmail.com
EXPOSE 8082

COPY entrypoint.sh /entrypoint.sh

RUN mkdir -p /opt/app/

COPY --from=build /tmp/target/devops-hp-1.1.jar /opt/app/devops-hp.jar

ENTRYPOINT ["/entrypoint.sh"]

HEALTHCHECK --interval=1m --timeout=3s CMD wget -q -T 3 -s http://localhost:8082/actuator/health/ || exit 1