package com.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hp.model.DevopsServiceDetail;
import com.hp.service.DevopsService;

@RestController("/devops")
public class DevopsController {
	
	private DevopsService service;
	
	@Autowired
	public DevopsController(DevopsService service) {
		this.service = service;
	}
	
	@GetMapping("/services")
	public List<DevopsServiceDetail> getServices() {
		return service.getServices();
	}
	
	@GetMapping("/service/{id}")
	public DevopsServiceDetail getServiceDetail(@PathVariable("id") int id) {
		return service.getService(id);
	}

}
