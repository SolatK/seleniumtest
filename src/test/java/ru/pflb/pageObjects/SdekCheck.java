package ru.pflb.pageObjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SdekCheck {
    private static String summ = "//span[@class=\"total\"]";

    private WebDriver driver;

    public SdekCheck(WebDriver driver) {
        this.driver = driver;
    }

    public void checkSumm(String cost) {
        WebElement element = driver.findElement(By.xpath(summ));
        Assertions.assertEquals(element.getText(), cost);
    }
}
