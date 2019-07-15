package com.nextnav.dockersample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	
	@Value("${variable}")
    private String variable;

	public String method34() {
		return variable;
		
	}
	
	public void printMethod() {
		
		String result = method34();
		System.out.println(result);
	}
}
