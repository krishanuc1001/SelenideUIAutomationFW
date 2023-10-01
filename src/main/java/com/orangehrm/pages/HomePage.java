package com.orangehrm.pages;

import com.orangehrm.enums.LeftPaneMenuItems;

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
        getLeftPane().selectMenuItemFromLeftPane(LeftPaneMenuItems.PIM);
        return EmployeeInfoPage.getInstance();
    }

    public String getHomePageTitle() {
        return title();
    }

}
