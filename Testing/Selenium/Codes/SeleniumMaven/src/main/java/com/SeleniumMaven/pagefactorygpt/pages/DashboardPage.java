package com.SeleniumMaven.pagefactorygpt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    // Locators
    @FindBy(xpath = "//h1[text()='Dashboard']")
    private WebElement dashboardHeader;

    // Constructor
    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Actions
    public boolean isDashboardDisplayed() {
        return dashboardHeader.isDisplayed();
    }
}

