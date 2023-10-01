package com.orangehrm.pages;

import static com.codeborne.selenide.Selenide.title;

public class HomePage {

    private final LeftPane leftPane;

    public HomePage() {
        this.leftPane = new LeftPane();
    }

    public LeftPane getLeftPane() {
        return leftPane;
    }

    public String getHomePageTitle() {
        return title();
    }


}
