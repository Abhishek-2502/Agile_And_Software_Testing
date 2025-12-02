package com.SeleniumMaven.pagefactory.pageobjectrepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffSignInPage {
    WebDriver driver;
//    By UserName = By.xpath("//*[@id=\"login1\"]");
    @FindBy(xpath = "//*[@id=\"login1\"]")
    WebElement UserName;

//    By Password = By.xpath("//*[@id=\"password\"]");
    @FindBy(xpath = "//*[@id=\\\"password\\\"]")
    WebElement Password;

//    By SignInButton = By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]");
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")
    WebElement SignInButton;

    public RediffSignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement userName() {
//        return driver.findElement(UserName);
        return UserName;
    }

    public WebElement password() {
//        return driver.findElement(Password);
        return Password;
    }

    public WebElement signInButton() {
//        return driver.findElement(SignInButton);
        return SignInButton;
    }

}