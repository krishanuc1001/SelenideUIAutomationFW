package com.orangehrm.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LeftPane {

    public void selectMenuItemFromLeftPane(String menuName) {
        $(byText(menuName))
                .shouldBe(visible)
                .click();
    }

}
