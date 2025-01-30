package ru.pflb.test;

import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.pflb.pageObjects.SdekCheck;
import ru.pflb.pageObjects.SdekMain;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    SdekMain mainPage;
    SdekCheck checkPage;


    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1920, 1080));

        mainPage = new SdekMain(driver);
        checkPage = new SdekCheck(driver);
    }

    @AfterEach
    public void close() {
        driver.quit();
    }
}
