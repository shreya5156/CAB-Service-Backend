package com.CabBooking.Cab.service.impl;

import com.CabBooking.Cab.representation.dto.Coordinates;
import com.CabBooking.Cab.representation.dto.DriverAvailabilityDetailsDTO;
import com.CabBooking.Cab.representation.request.DriverRegisterRequest;
import com.CabBooking.Cab.representation.request.FindRideRequest;
import com.CabBooking.Cab.representation.request.UserRegisterRequest;
import com.CabBooking.Cab.service.IFindRideService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.CabBooking.Cab.service.impl.DriverServiceImpl.driverAvailabilityDetailsDTOList;
import static com.CabBooking.Cab.service.impl.UserServiceImpl.userList;
import static com.CabBooking.Cab.service.impl.UserServiceImpl.userMap;

@Service
public class FindRideServiceImpl implements IFindRideService {
    static List<DriverAvailabilityDetailsDTO> availableDrivers = new ArrayList<>();
    @Override
    public List<DriverAvailabilityDetailsDTO> findRide(FindRideRequest findRideRequest) {
        try {
            String name = findRideRequest.getName();
            double distance = 0;
            UserRegisterRequest user = userMap.get(name);
            user.setCoordinates(findRideRequest.getCoordinates());
            System.out.println("jjust printing-check user coordinates");
            for (DriverAvailabilityDetailsDTO driver : driverAvailabilityDetailsDTOList) {
                if (driver.isAvailable()) {
                    distance = Math.sqrt(Math.pow(user.getCoordinates().getX() - driver.getCoordinates().getX(), 2)
                            + Math.pow(user.getCoordinates().getY() - driver.getCoordinates().getY(), 2));
                    if (distance <= 7) {
                        //driver.setAvailable(false);
                        availableDrivers.add(driver);
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            throw  new RuntimeException("Error while processing your request");
        }
        return  availableDrivers;
   }
}
