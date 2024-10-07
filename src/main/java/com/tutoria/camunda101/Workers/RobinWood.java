package com.tutoria.camunda101.Workers;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

import org.springframework.stereotype.Component;
@Slf4j
@Component
public class RobinWood {

    // This method extracts variables from zeebe


    @JobWorker(type = "hello", autoComplete = true)
    public void sendFinalNotifica(final ActivatedJob job) {
        log.info("welcome");
    }

    @JobWorker(type = "printout", autoComplete = true)
    public void sendFinalNotification(final ActivatedJob job) {
        log.info("rest out bound finished");
        Map<String, Object> variables = job.getVariablesAsMap();
        log.info("========================");
        log.info(variables.toString());
        
    }

   
}
