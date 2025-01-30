package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SdekMain {
    private static String baseUrl = "https://www.cdek.ru/";
    private static String cityShortcut = "//*[text()='%s' and contains(@data-test, '%s')]";
    private static String boxSize = "//div[@class=\"cdek-dropdown-trigger__control\"]";
    private static String box = "//div[contains(@class, 'choice-item')]//p[text()='%s']";
    private static String orderButton = "//button[@data-test=\"order-widget-btn\"]";

    private WebDriver driver;

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
        driver.findElement(By.xpath(boxSize)).click();
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
        driver.findElement(By.xpath(orderButton)).click();
    }

}
