package ru.pflb.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SdekTest extends BaseTest {


    @Test
    @DisplayName("Рассчитать посылку")
    public void test() throws InterruptedException {
        mainPage.openPage();
        mainPage.clickCityShortcut("Москва", "from");
        mainPage.clickCityShortcut("Санкт-Петербург", "to");
        mainPage.clickBoxMenu();
        mainPage.scrollDown();
        mainPage.clickMenuOption("Короб S");
        mainPage.clickCheck();
        checkPage.checkSumm("490,00 ₽");
    }
}
