package com.SeleniumMaven.pagefactory.pageobjectrepo;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffHomePage {

    WebDriver driver;

    //    By Logo = By.xpath("/html/body/div[1]/div/div[2]/img");
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/img")
    WebElement Logo;

    //    By SignIn = By.xpath("//*[@id=\"signin_info\"]/a[1]");
    @FindBy(xpath = "//*[@id=\\\"signin_info\\\"]/a[1]")
    WebElement SignIn;


    public RediffHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement logo() {
//        return driver.findElement(Logo);
        return Logo;
    }

    public WebElement signIn() {
//        return driver.findElement(SignIn);
        return SignIn;
    }

}

