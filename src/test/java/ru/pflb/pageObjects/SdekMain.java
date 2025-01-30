package ru.pflb.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SdekMain {
    private static String baseUrl = "https://www.cdek.ru/";
    private static String fromMoscow = "//button[@data-test=\"direction-cities-from-0\"]";
    private static String toPiter = "//button[@data-test=\"direction-cities-to-1\"]";
    private static String boxSize = "//div[@class=\"cdek-dropdown-trigger__control\"]";
    private static String box = "//div[@data-test=\"direction-dimension-item-3\"]";
    private static String orderButton = "//button[@data-test=\"order-widget-btn\"]";

    private WebDriver driver;

    public SdekMain(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(baseUrl + "/ru");
    }

    public void clickFromMoscow() {
        driver.findElement(By.xpath("//button[@data-test=\"direction-cities-from-0\"]")).click();
    }

    public void clickToPiter() {
        driver.findElement(By.xpath("//button[@data-test=\"direction-cities-to-1\"]")).click();
    }

    public void clickBoxMenu() {
        driver.findElement(By.xpath("//div[@class=\"cdek-dropdown-trigger__control\"]")).click();
    }

    public void clickMenuOption() {
        WebElement element = driver.findElement(By.xpath("//div[@data-test=\"direction-dimension-item-3\"]"));
        element.click();
    }

    public void scrollDown() {
        new Actions(driver)
                .scrollByAmount(0, 300)
                .perform();
    }

    public void clickCheck() {
        driver.findElement(By.xpath("//button[@data-test=\"order-widget-btn\"]")).click();
    }

}
