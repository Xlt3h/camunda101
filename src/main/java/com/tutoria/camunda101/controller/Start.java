package com.tutoria.camunda101.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ProcessInstanceEvent;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/camunda/")
public class Start {
    @Autowired
	private ZeebeClient client;
    @GetMapping("start")
    public String getMethodName() 
    {
        Map<String,String> variables = Map.of("camunda","is fun");
        @SuppressWarnings("unused")
        final ProcessInstanceEvent processInstanceResults = client
					.newCreateInstanceCommand()
					.bpmnProcessId("camunda-8-tutorial")
					.latestVersion()
					.variables(variables)
					.send()
					.join();
        
        return "camunda has started yey!!!";
    }
    @GetMapping("fun")
    public String getfreeapi() {
        return "done";
    }
    
    
}
