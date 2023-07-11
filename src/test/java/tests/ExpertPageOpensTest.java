package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ResultsPage;

import static io.qameta.allure.Allure.step;

public class ExpertPageOpensTest extends TestBase {

    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();

    @Epic("Main Page")
    @Owner(value = "Frolova Nadezhda")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка перехода на страницу консультации экспертов")
    @Test
    void expertPageOpens() {
        step("На главной странице кликнуть на кнопку 'Готовое резюме'", () ->
                mainPage.openHh().clickExpertResumeButton());
        step("Переход на страницу консультации экспертов", () ->
                resultsPage.checkExpertResumePageOpened());
    }
}

