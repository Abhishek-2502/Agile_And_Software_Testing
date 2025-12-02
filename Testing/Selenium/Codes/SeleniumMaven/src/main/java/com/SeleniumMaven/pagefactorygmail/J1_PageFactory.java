package com.SeleniumMaven.pagefactorygmail;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class J1_PageFactory {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com/");
        driver.manage().window().maximize();
        GmailLoginPage loginPage = new GmailLoginPage(driver);
        loginPage.enterEmail("gener.ator@gmail.com");
        loginPage.clickNextButton();

        loginPage.enterPassword("Your_Mail_Password");
        loginPage.clickNextButton();

    }
}

