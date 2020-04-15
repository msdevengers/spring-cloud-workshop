package com.microsoft.sample.controller.actuator;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id = "samples")
@Component
public class SampleActuatorEndpoint {

    @ReadOperation
    public String dump(){
        return "healthy";
    }

}
