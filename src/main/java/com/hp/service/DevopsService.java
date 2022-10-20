package com.hp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hp.model.DevopsServiceDetail;

@Service
public class DevopsService {

	public List<DevopsServiceDetail> getServices() {
		
		DevopsServiceDetail serv1=new DevopsServiceDetail(1,"Jenkins","CI");
		DevopsServiceDetail serv2=new DevopsServiceDetail(1,"Terraform","IOAutomation");
		
		List<DevopsServiceDetail> services =  new ArrayList<DevopsServiceDetail>();
		services.add(serv1);
		services.add(serv2);
		
		return services;
		
	}

	public DevopsServiceDetail getService(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
