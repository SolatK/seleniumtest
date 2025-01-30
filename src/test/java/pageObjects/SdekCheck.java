package pageObjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SdekCheck {
    private static final By summ = By.xpath("//span[@class=\"total\"]");

    private final WebDriver driver;

    public SdekCheck(WebDriver driver) {
        this.driver = driver;
    }

    public void checkSumm(String cost) {
        WebElement element = driver.findElement(summ);
        Assertions.assertEquals(element.getText(), cost);
    }
}