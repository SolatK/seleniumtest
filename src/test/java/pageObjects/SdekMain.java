package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SdekMain {
    private static final String baseUrl = "https://www.cdek.ru/";
    private static final String cityShortcut = "//*[text()='%s' and contains(@data-test, '%s')]";
    private static final String box = "//div[contains(@class, 'choice-item')]//p[text()='%s']";
    private static final By boxSize = By.xpath("//div[@class=\"cdek-dropdown-trigger__control\"]");
    private static final By orderButton = By.xpath("//button[@data-test=\"order-widget-btn\"]");

    private final WebDriver driver;

    public SdekMain(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(baseUrl + "/ru");
    }

    public void clickCityShortcut(String name, String direction) {
        driver.findElement(By.xpath(String.format(cityShortcut, name, direction))).click();
    }

    public void clickBoxMenu() {
        driver.findElement(boxSize).click();
    }

    public void clickMenuOption(String option) {
        WebElement element = driver.findElement(By.xpath(String.format(box, option)));
        element.click();
    }

    public void scrollDown() {
        new Actions(driver)
                .scrollByAmount(0, 300)
                .perform();
    }

    public void clickCheck() {
        driver.findElement(orderButton).click();
    }

}
