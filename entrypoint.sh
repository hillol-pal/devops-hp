#!/usr/bin/env bash
cd /opt/app

java -Dconfig.override_with_env_vars=true \
    -Dnetworkaddress.cache.ttl=60 \
    -Djava.security.egd=file:/dev/./urandom \
    ${JAVA_OPTS} \
    -jar devops-hp.jar $@