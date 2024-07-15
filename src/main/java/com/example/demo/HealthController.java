package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@Api(value = "Health Controller", description = "Controller to check the health status of the API")
public class HealthController {

    @GetMapping
    @ApiOperation(value = "Returns the health status of the API")
    public String getHealthStatus() {
        return "API working OK!";
    }
}