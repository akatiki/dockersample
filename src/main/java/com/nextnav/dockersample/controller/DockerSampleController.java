package com.nextnav.dockersample.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextnav.dockersample.service.ServiceClass;


@RestController
public class DockerSampleController {
	
	@Autowired
	ServiceClass serviceClass;
	
	@RequestMapping(value ="/hello", method = RequestMethod.GET)
	public String hello() {
		serviceClass.printMethod();
		return serviceClass.method34();
	}
	

}
