package com.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class J1_FirstScript {
    public static void main(String[] args) {
//        https://www.selenium.dev/documentation/


        // Set the system property for ChromeDriver (path to chromedriver executable)
        System.setProperty("webdriver.chrome.driver", "D:/Software/Educational/Chrome Driver/134/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        try {


            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            /*
            * There are a bunch of types of information about the browser you can request, including window handles, browser size / position, cookies, alerts, etc.
            * */
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

            /*
            * Establish Waiting Strategy
              Synchronizing the code with the current state of the browser is one of the biggest challenges with Selenium, and doing it well is an advanced topic.

              Essentially you want to make sure that the element is on the page before you attempt to locate it and the element is in an interactable state before you attempt to interact with it.

              An implicit wait is rarely the best solution, but it’s the easiest to demonstrate here, so we’ll use it as a placeholder.

            * */
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50));
            Thread.sleep(3000);

            /*
            * The majority of commands in most Selenium sessions are element related, and you can’t interact with one without first finding an element
            * */
            WebElement textBox = driver.findElement(By.name("my-text"));
            WebElement submitButton = driver.findElement(By.cssSelector("button"));

            /*
            * There are only a handful of actions to take on an element, but you will use them frequently.
            * */
            textBox.sendKeys("Selenium");
            Thread.sleep(3000);
            submitButton.click();

            WebElement message = driver.findElement(By.id("message"));
            System.out.println("Message: "+message.getText());

            // Wait for a few seconds (for demonstration purposes only)
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            /*
            * This ends the driver process, which by default closes the browser as well. No more commands can be sent to this driver instance.
             * */
            driver.quit();
        }

    }
}