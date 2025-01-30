package ru.pflb.test;

import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.pflb.pageObjects.SdekMain;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    SdekMain page;


    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1920, 1080));

        page = new SdekMain(driver);
    }

    @AfterEach
    public void close() {
        driver.quit();
    }
}
