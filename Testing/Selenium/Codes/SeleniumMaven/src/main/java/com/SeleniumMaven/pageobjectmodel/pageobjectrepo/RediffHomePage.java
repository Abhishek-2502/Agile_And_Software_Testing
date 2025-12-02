package com.SeleniumMaven.pageobjectmodel.pageobjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

    WebDriver driver;
//    By Logo = By.xpath("//span[@class='hmsprite logo']");
//    By SignIn = By.xpath("//a[@title='Already a user? Sign in']");
    By Logo = By.xpath("/html/body/div[1]/div/div[2]/img");
    By SignIn = By.xpath("//*[@id=\"signin_info\"]/a[1]");



    public RediffHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement logo() {
        return driver.findElement(Logo);
    }

    public WebElement signIn() {
        return driver.findElement(SignIn);
    }

}
