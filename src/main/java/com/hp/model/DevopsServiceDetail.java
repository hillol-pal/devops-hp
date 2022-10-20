package com.hp.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class DevopsServiceDetail {
	
	public DevopsServiceDetail(int id, String serviceName, String purpose) {
		this.id = id;
		this.serviceName = serviceName;
		this.purpose = purpose;
	}
	private int id;
	private String serviceName;
	private String purpose;

}
