package com.orangehrm.pojos;

import lombok.Data;
import uk.co.jemos.podam.common.PodamStringValue;

@Data
public class LoginDetails {

    @PodamStringValue(strValue = "Admin")
    private String username;

    @PodamStringValue(strValue = "admin123")
    private String password;
}
