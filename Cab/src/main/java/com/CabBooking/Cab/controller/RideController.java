package com.CabBooking.Cab.controller;

import com.CabBooking.Cab.representation.dto.DriverAvailabilityDetailsDTO;
import com.CabBooking.Cab.representation.request.ChooseRideRequest;
import com.CabBooking.Cab.representation.request.FindRideRequest;
import com.CabBooking.Cab.service.IChooseRideService;
import com.CabBooking.Cab.service.IFindRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class RideController {

    private IFindRideService iFindRideService;
    private IChooseRideService iChooseRideService;

    @Autowired
    public void setiFindRideService(IFindRideService iFindRideService) {

        this.iFindRideService = iFindRideService;
    }

    @Autowired
    public void setiChooseRideService(IChooseRideService iChooseRideService) {
        this.iChooseRideService = iChooseRideService;
    }

    @PostMapping("/find/ride")
    public List<DriverAvailabilityDetailsDTO> findRide(@RequestBody FindRideRequest findRideRequest)
    {
        return iFindRideService.findRide(findRideRequest);
    }

    @PostMapping("/choose/ride")
    public String chooseRide(@RequestBody ChooseRideRequest chooseRideRequest)
    {
        return iChooseRideService.chooseRide(chooseRideRequest);
    }
}
