package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;
import com.google.common.util.concurrent.Uninterruptibles;
import com.orangehrm.pojos.EmployeeDetails;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeInfoPage {

    private static final SelenideElement ADD_EMPLOYEE_BTN = $(byTagAndText("a", "Add Employee"));
    private static final SelenideElement FIRST_NAME = $(byName("firstName"));
    private static final SelenideElement LAST_NAME = $(byName("lastName"));
    private static final SelenideElement UPLOAD_PHOTO = $(byXpath("//input[@type='file']"));
    private static final SelenideElement SAVE_BTN = $(byText("Save"));
    private static final SelenideElement SUCCESS_MESSAGE = $(byText("Success"));

    public EmployeeInfoPage addNewEmployee(EmployeeDetails employee) {
        ADD_EMPLOYEE_BTN.shouldBe(visible).click();
        FIRST_NAME.shouldBe(visible).setValue(employee.getFirstName());
        LAST_NAME.shouldBe(visible).setValue(employee.getLastName());
        UPLOAD_PHOTO.shouldBe(enabled).uploadFromClasspath("images/myimage.jpeg");
        SAVE_BTN.shouldBe(enabled).click();
        return this;
    }

    public boolean isEmployeeAdded() {
        try {
            SUCCESS_MESSAGE
                    .shouldHave(visible);
            Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
