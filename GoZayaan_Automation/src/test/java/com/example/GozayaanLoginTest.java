package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GozayaanLoginTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void testLogin() {
        // Navigate to Gozayaan login page
        driver.get("https://gozayaan.com/account/signin");

        // Locate username and password fields
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));

        // Locate login button
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.id("submitBtn")
        ));

        // Enter credentials (replace with valid test account)
        usernameField.sendKeys("sozibul23@gmail.com");
        passwordField.sendKeys("123456Ss!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginButton.click();


        // Verify login success by checking for a dashboard or welcome element
        try {
            WebElement dashboardElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Dashboard')]"))
            );
            if (dashboardElement.isDisplayed()) {
                System.out.println("✅ Login successful!");
            } else {
                System.out.println("❌ Login failed!");
            }
        } catch (Exception e) {
            System.out.println("⚠️ Dashboard not found. Login may have failed or page layout changed.");
        }
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("🧹 Browser closed");
    }
}
