package com.CabBooking.Cab.representation.request;

import com.CabBooking.Cab.configuration.constant.user.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterRequest {
    private String name;
    private Gender gender;
    private Integer age;
}
