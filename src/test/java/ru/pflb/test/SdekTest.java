package ru.pflb.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SdekTest extends BaseTest {


    @Test
    @DisplayName("Рассчитать посылку")
    public void test() throws InterruptedException {
        mainPage.openPage();
        mainPage.clickFromMoscow();
        mainPage.clickToPiter();
        mainPage.clickBoxMenu();
        mainPage.scrollDown();
        mainPage.clickMenuOption();
        mainPage.clickCheck();
        checkPage.checkSumm("490,00 ₽");
    }
}
