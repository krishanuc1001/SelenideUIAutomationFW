package com.orangehrm.tests;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.pojos.EmployeeDetails;
import com.orangehrm.pojos.LoginDetails;
import com.orangehrm.testdata.EmployeeTestData;
import com.orangehrm.testdata.LoginTestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddEmployeeTest extends TestSetup {

    private final EmployeeDetails employeeDetails = EmployeeTestData.getDynamicEmployeeDetails();
    private final LoginDetails loginDetails = LoginTestData.getValidLoginCredentials();

    @Test
    void validateAdditionOfEmployee() {

        Assertions.assertTrue(LoginPage.getInstance()
                .userLogin(loginDetails)
                .navigateToEmployeeInfoPage()
                .addNewEmployee(employeeDetails)
                .isEmployeeAdded());

    }

}
