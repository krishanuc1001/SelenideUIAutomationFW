package com.orangehrm.tests;

import com.orangehrm.pages.LoginPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

class AddEmployeeTest {

    @Test
    void validateAdditionOfEmployee() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        new LoginPage()
                .userLogin()
                .getHomePageTitle();
    }

}
