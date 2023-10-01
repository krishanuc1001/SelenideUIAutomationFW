package com.orangehrm.pages;

import com.orangehrm.enums.LeftPaneMenuItemEnums;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LeftPane {

    public void selectMenuItemFromLeftPane(LeftPaneMenuItemEnums leftPaneMenuItems) {
        $(byText(leftPaneMenuItems.getMenuName()))
                .shouldBe(enabled)
                .click();
    }

}
