package com.CabBooking.Cab.service.impl;

import com.CabBooking.Cab.representation.dto.DriverAvailabilityDetailsDTO;
import com.CabBooking.Cab.representation.request.ChooseRideRequest;
import com.CabBooking.Cab.service.IChooseRideService;
import org.springframework.stereotype.Service;
import static com.CabBooking.Cab.service.impl.FindRideServiceImpl.availableDrivers;

@Service
public class ChooseRideServiceImpl implements IChooseRideService {
    @Override
    public String chooseRide(ChooseRideRequest chooseRideRequest) {
        try {
            String toReturn = null;
            for (DriverAvailabilityDetailsDTO driver : availableDrivers) {
                if (driver.getName().equals(chooseRideRequest.getDriverName()) && driver.isAvailable()) {
                    driver.setAvailable(false);
                    return "Driver selected->" + driver.getName();
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
