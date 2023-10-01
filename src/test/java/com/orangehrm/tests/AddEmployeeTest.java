package com.orangehrm.tests;

import com.orangehrm.pages.EmployeeInfoPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pojos.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import static com.codeborne.selenide.Selenide.open;

class AddEmployeeTest {

    private final PodamFactory podamFactory = new PodamFactoryImpl();

    @Test
    void validateAdditionOfEmployee() {

        Employee employee = podamFactory.manufacturePojo(Employee.class);

        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        new LoginPage()
                .userLogin()
                .getLeftPane()
                .selectMenuItemFromLeftPane("PIM");

        Assertions.assertTrue(new EmployeeInfoPage()
                .addNewEmployee(employee)
                .isEmployeeAdded(), "<<=========== EMPLOYEE NOT ADDED SUCCESSFULLY ===========>>");
    }

}
