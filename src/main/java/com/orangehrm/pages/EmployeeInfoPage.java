package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class EmployeeInfoPage {

    private static final SelenideElement ADD_EMPLOYEE_BTN = $(byTagAndText("a", "Add Employee"));
    private static final SelenideElement FIRST_NAME = $(byName("firstName"));
    private static final SelenideElement LAST_NAME = $(byName("lastName"));
    private static final SelenideElement UPLOAD_PHOTO = $(byXpath("//input[@type='file']"));
    private static final SelenideElement SAVE_BTN = $(byText("Save"));
    private static final SelenideElement SUCCESS_MESSAGE = $(byText("Success"));

    public EmployeeInfoPage addNewEmployee() {
        ADD_EMPLOYEE_BTN.shouldBe(visible).click();
        FIRST_NAME.shouldBe(visible).setValue("Krishanu");
        LAST_NAME.shouldBe(visible).setValue("Chakraborty");
        UPLOAD_PHOTO.shouldBe(enabled).uploadFromClasspath("myimage.jpeg");
        SAVE_BTN.shouldBe(enabled).click();
        return this;
    }

    public void isEmployeeAdded() {
        SUCCESS_MESSAGE
                .shouldHave(visible);
    }

}
