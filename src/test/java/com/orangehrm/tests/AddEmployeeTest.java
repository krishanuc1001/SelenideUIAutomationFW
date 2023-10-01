package com.orangehrm.tests;

import com.orangehrm.pages.EmployeeInfoPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pojos.EmployeeDetails;
import com.orangehrm.testdata.EmployeeTestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddEmployeeTest {

    EmployeeDetails employee = EmployeeTestData.getDynamicEmployeeDetails();

    @Test
    void validateAdditionOfEmployee() {
        LoginPage.getInstance()
                .userLogin()
                .getLeftPane()
                .selectMenuItemFromLeftPane("PIM");

        Assertions.assertTrue(EmployeeInfoPage.getInstance()
                .addNewEmployee(employee)
                .isEmployeeAdded(), "<<=========== EMPLOYEE NOT ADDED SUCCESSFULLY ===========>>");
    }

}
