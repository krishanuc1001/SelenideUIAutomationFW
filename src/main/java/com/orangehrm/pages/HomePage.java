package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class HomePage {
    public String getHomePageTitle() {
        return title();
    }

}
