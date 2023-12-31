package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;
import com.orangehrm.pojos.LoginDetails;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginPage {

    public static LoginPage getInstance() {
        return new LoginPage();
    }

    private static final SelenideElement USERNAME = $(byName("username"));
    private static final SelenideElement PASSWORD = $(byAttribute("placeholder", "Password"));
    private static final SelenideElement LOGIN_BTN = $(byAttribute("type", "submit"));

    public HomePage userLogin(LoginDetails loginDetails) {
        USERNAME
                .shouldBe(visible)
                .setValue(loginDetails.getUsername());
        PASSWORD
                .shouldBe(visible)
                .setValue(loginDetails.getPassword());
        LOGIN_BTN
                .shouldBe(enabled)
                .click();
        return new HomePage();
    }

}
