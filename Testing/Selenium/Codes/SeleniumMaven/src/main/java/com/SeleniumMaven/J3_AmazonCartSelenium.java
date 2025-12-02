package com.SeleniumMaven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.Set;

public class J3_AmazonCartSelenium {

    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void eightComponents() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        Actions action=new Actions(driver);

//        //iframes
//        driver.get("http://demo.automationtesting.in/Frames.html");
//        WebElement frame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//        driver.switchTo().frame(frame);
//        Thread.sleep(2000);
//
//        WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
//        textbox.sendKeys("hey");
//        Thread.sleep(3000);



        // Open web app
//        driver.get("https://amazon.in");
        driver.navigate().to("https://amazon.in");
        driver.manage().window().maximize();

        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Amazon.in")){
            System.out.println("Title Matches");
        }
        else{
            System.out.println(title);
        }

        Thread.sleep(8000);

        //locate a web element
        WebElement tagname=driver.findElement(By.id("nav-hamburger-menu"));
        System.out.println(tagname);
        action.click(tagname);
        action.perform();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Mobiles, Computers")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("All Mobile Phones")).click();
        Thread.sleep(3000);

        //Typing the text
        WebElement myElement=driver.findElement(By.id("twotabsearchtextbox"));
        myElement.sendKeys("iPhone 11");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);

        //Scroll the webpage
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500)");
        Thread.sleep(3000);


        //Select the phone
        driver.findElement(By.partialLinkText("iPhone 13")).click();
        Thread.sleep(2000);


        //Shift the tab control
        Set<String> handles = driver.getWindowHandles();
        String winHandle1 = driver.getWindowHandle();
        handles.remove(winHandle1);

        String winHandle=handles.iterator().next();
        String winHandle2=" ";
        if(winHandle!=winHandle1){

            //To retrieve the handle of second window
            winHandle2=winHandle; //Storing handle of 2nd window handle
            //Switch control to new tab
            driver.switchTo().window(winHandle2);
            System.out.println(winHandle2);
        }
        Thread.sleep(2000);

        //Add to Cart
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);

        //Buy Now
//        driver.findElement(By.id("buy-now-button")).click();
//        Thread.sleep(2000);













//
//        // Open web app
////        driver.get("https://amazon.in");
//        driver.navigate().to("https://amazon.in");
//        driver.manage().window().maximize();
//
//        String title = driver.getTitle();
//
//        if(title.equalsIgnoreCase("Amazon.in")){
//            System.out.println("Title Matches");
//        }
//        else{
//            System.out.println(title);
//        }
//
//        Thread.sleep(10000);
//
//        //locate a web element
//        String tagname=driver.findElement(By.cssSelector("")).getText();
//        System.out.println(tagname);
//
//        //Dropdown
//        WebElement category = driver.findElement(By.cssSelector(""));
//        action.moveToElement(category).perform();
//        Thread.sleep(2000);
//
//        WebElement books = driver.findElement(By.cssSelector(""));
//        action.moveToElement(books);
//        action.click();
//        action.perform();
//        Thread.sleep(3000);
//
//        driver.findElement(By.linkText("Fiction Books")).click();
//        Thread.sleep(2000);
//
//        //Typing the text
//        WebElement myElement=driver.findElement(By.id(""));
//        myElement.sendKeys("Iphone");
//
//        driver.findElement(By.className("")).click();
//        Thread.sleep(2000);
//
//        //Select the book
//        driver.findElement(By.partialLinkText("")).click();
//        Thread.sleep(2000);
//
//        //Shift the tab control
//        Set<String> handles = driver.getWindowHandles();
//        String winHandle1 = driver.getWindowHandle();
//        handles.remove(winHandle1);
//
//        String winHandle=handles.iterator().next();
//        String winHandle2=" ";
//        if(winHandle!=winHandle1){
//
//            //To retrieve the handle of second window, extraction the handle
//            winHandle2=winHandle; //Storing handle of 2nd window handle
//            //Switch control to new tab
//            driver.switchTo().window(winHandle2);
//            System.out.println(winHandle2);
//        }
//        Thread.sleep(2000);
//
//        //Add to Cart
//        driver.findElement(By.cssSelector("")).click();
//        Thread.sleep(5000);
//
//        //Scroll the webpage till end
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        Thread.sleep(3000);




    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }

}
