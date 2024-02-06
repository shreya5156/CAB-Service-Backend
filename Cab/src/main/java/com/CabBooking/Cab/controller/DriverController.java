package com.CabBooking.Cab.controller;

import com.CabBooking.Cab.representation.request.DriverRegisterRequest;
import com.CabBooking.Cab.service.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DriverController {

    private IDriverService driverService;

    @Autowired
    public void setDriverService(IDriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping("/driver/register")
    public String registerDriver(@RequestBody DriverRegisterRequest driverRegisterRequest ){
        return driverService.registerDriver(driverRegisterRequest);
    }
}
