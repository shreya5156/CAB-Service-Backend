package com.CabBooking.Cab.service.impl;

import com.CabBooking.Cab.representation.dto.DriverAvailabilityDetailsDTO;
import com.CabBooking.Cab.representation.request.ChooseRideRequest;
import com.CabBooking.Cab.service.IChooseRideService;
import com.CabBooking.Cab.service.IFindRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
//import static com.CabBooking.Cab.service.impl.FindRideServiceImpl.availableDrivers;

@Service
@Scope("singleton")
public class ChooseRideServiceImpl implements IChooseRideService {
    private final IFindRideService findRideService;
    @Autowired
    public ChooseRideServiceImpl(IFindRideService findRideService) {
        this.findRideService = findRideService;
    }

    @Override
    public String chooseRide(ChooseRideRequest chooseRideRequest) {
        try {
            List<DriverAvailabilityDetailsDTO> availableDrivers = findRideService.getAvailableDrivers() ;
            for (DriverAvailabilityDetailsDTO driver : availableDrivers) {
                if (driver.getName().equals(chooseRideRequest.getDriverName()) && driver.isAvailable()) {
                    driver.setAvailable(false);
                    return "Driver selected-> " + driver.getName();
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw  new RuntimeException("Error while processing your request");
        }
        return "No available drivers found";
    }
}
