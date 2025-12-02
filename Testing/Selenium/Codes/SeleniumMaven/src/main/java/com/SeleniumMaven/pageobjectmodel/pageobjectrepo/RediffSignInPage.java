package com.SeleniumMaven.pageobjectmodel.pageobjectrepo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RediffSignInPage {
    WebDriver driver;
//    By UserName = By.xpath("//input[@id='login1']");
//    By Password = By.xpath("//input[@id='password']");
//    By SignInButton = By.xpath("//input[@title='Sign in']");
    By UserName = By.xpath("//*[@id=\"login1\"]");
    By Password = By.xpath("//*[@id=\"password\"]");
    By SignInButton = By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]");

    public RediffSignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement userName() {
        return driver.findElement(UserName);
    }

    public WebElement password() {
        return driver.findElement(Password);
    }

    public WebElement signInButton() {
        return driver.findElement(SignInButton);
    }

}