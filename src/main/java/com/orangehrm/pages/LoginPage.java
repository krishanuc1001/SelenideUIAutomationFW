package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginPage {

    private static final SelenideElement USERNAME = $(byName("username"));
    private static final SelenideElement PASSWORD = $(byAttribute("placeholder", "Password"));
    private static final SelenideElement LOGIN_BTN = $(byAttribute("type", "submit"));

    public HomePage userLogin() {
        USERNAME
                .shouldBe(visible)
                .setValue("Admin");
        PASSWORD
                .shouldBe(visible)
                .setValue("admin123");
        LOGIN_BTN
                .shouldBe(enabled)
                .click();
        return new HomePage();
    }

}
