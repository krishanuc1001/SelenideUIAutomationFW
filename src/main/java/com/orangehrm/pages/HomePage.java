package com.orangehrm.pages;

import com.orangehrm.enums.LeftPaneMenuItemEnums;

import static com.codeborne.selenide.Selenide.title;

public class HomePage {

    private final LeftPane leftPane;

    public HomePage() {
        this.leftPane = new LeftPane();
    }

    public LeftPane getLeftPane() {
        return leftPane;
    }

    public EmployeeInfoPage navigateToEmployeeInfoPage() {
        getLeftPane().selectMenuItemFromLeftPane(LeftPaneMenuItemEnums.PIM);
        return EmployeeInfoPage.getInstance();
    }

    public String getHomePageTitle() {
        return title();
    }

}
