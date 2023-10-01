package com.orangehrm.tests;

import com.orangehrm.pages.EmployeeInfoPage;
import com.orangehrm.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

class AddEmployeeTest {

    @Test
    void validateAdditionOfEmployee() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        new LoginPage()
                .userLogin()
                .getLeftPane()
                .selectMenuItemFromLeftPane("PIM");

        Assertions.assertTrue(new EmployeeInfoPage()
                .addNewEmployee()
                .isEmployeeAdded(), "<<=========== EMPLOYEE NOT ADDED SUCCESSFULLY ===========>>");
    }

}
