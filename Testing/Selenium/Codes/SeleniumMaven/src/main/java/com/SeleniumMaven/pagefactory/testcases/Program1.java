package com.SeleniumMaven.pagefactory.testcases;


import com.SeleniumMaven.pageobjectmodel.pageobjectrepo.RediffHomePage;
import com.SeleniumMaven.pageobjectmodel.pageobjectrepo.RediffSignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class Program1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Software\\Educational\\Chrome Driver\\139\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void verifyLogo() {
        RediffHomePage rhp = new RediffHomePage(driver);
        WebElement logo = rhp.logo();
        Boolean flag = logo.isDisplayed();
        Assert.assertTrue(flag);
    }

    @Test
    public void signInTestcase() {
        RediffHomePage rhp = new RediffHomePage(driver);
        rhp.signIn().click();
        RediffSignInPage rsp = new RediffSignInPage(driver);
        rsp.userName().sendKeys("abc");
        rsp.password().sendKeys("123");
        rsp.signInButton().click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("https://mail.rediff.com/action/authvalidate"));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

