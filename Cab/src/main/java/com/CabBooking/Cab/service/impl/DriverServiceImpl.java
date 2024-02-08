package com.CabBooking.Cab.service.impl;

import com.CabBooking.Cab.representation.dto.DriverAvailabilityDetailsDTO;
import com.CabBooking.Cab.representation.request.DriverRegisterRequest;
import com.CabBooking.Cab.service.IDriverService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverServiceImpl implements IDriverService {
    static List<DriverAvailabilityDetailsDTO> driverAvailabilityDetailsDTOList = new ArrayList<>();

    @Override
    public String registerDriver(DriverRegisterRequest driverRegisterRequest) {
            try{
                DriverAvailabilityDetailsDTO driverAvailabilityDetailsDTO = new DriverAvailabilityDetailsDTO();
                driverAvailabilityDetailsDTO.setName(driverRegisterRequest.getName());
                driverAvailabilityDetailsDTO.setCarDetails(driverRegisterRequest.getCarDetails());
                driverAvailabilityDetailsDTO.setAge(driverRegisterRequest.getAge());
                driverAvailabilityDetailsDTO.setGender(driverRegisterRequest.getGender());
                driverAvailabilityDetailsDTO.setCoordinates(driverRegisterRequest.getCoordinates());
                driverAvailabilityDetailsDTO.setAvailable(true);
                driverAvailabilityDetailsDTOList.add(driverAvailabilityDetailsDTO);
            } catch (Exception e) {
                e.printStackTrace();
                throw  new RuntimeException("Error while processing your request");
            }
            return "Your registration is successful";
    }
}
