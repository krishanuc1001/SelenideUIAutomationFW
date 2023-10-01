package com.orangehrm.testdata;

import com.orangehrm.pojos.EmployeeDetails;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class EmployeeTestData {

    private static final PodamFactory FACTORY = new PodamFactoryImpl();

    public static EmployeeDetails getDynamicEmployeeDetails() {
        return FACTORY.manufacturePojo(EmployeeDetails.class);
    }

}
