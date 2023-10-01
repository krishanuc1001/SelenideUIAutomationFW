package com.orangehrm.testdata;

import com.orangehrm.pojos.LoginDetails;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LoginTestData {
    private static final PodamFactory FACTORY = new PodamFactoryImpl();

    public static LoginDetails getValidLoginCredentials() {
        return FACTORY.manufacturePojo(LoginDetails.class);
    }

}
