package com.CabBooking.Cab.representation.request;

import com.CabBooking.Cab.configuration.constant.user.Gender;
import com.CabBooking.Cab.representation.dto.Coordinates;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverRegisterRequest {
    private String name;
    private Gender gender;
    private Integer age;
    private String carDetails;
    private Coordinates coordinates;
}
