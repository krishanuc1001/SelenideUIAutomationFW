package com.orangehrm.pojos;

import lombok.Data;
import uk.co.jemos.podam.common.PodamStringValue;

@Data
public class EmployeeDetails {
    private String firstName;
    private String lastName;

    @PodamStringValue(strValue = "images/myimage.jpeg")
    private String myImagePath;
}
