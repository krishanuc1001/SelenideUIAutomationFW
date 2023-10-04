package com.orangehrm.tests;

import com.codeborne.selenide.junit5.TextReportExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.codeborne.selenide.Selenide.open;

@ExtendWith({TextReportExtension.class})
public class TestSetup {

    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true));
    }

    @BeforeEach
    void setUp() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

}
