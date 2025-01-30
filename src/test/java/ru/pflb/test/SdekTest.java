package ru.pflb.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SdekTest extends BaseTest {


    @Test
    @DisplayName("Рассчитать посылку")
    public void test() throws InterruptedException {
        page.openPage();
        page.clickFromMoscow();
        page.clickToPiter();
        page.clickBoxMenu();
        page.scrollDown();
        page.clickMenuOption();
        page.clickCheck();
    }
}
