package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ResultsPage;

import static io.qameta.allure.Allure.step;

public class ResumeCreationPageOpensTest extends TestBase {

    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();

    @Epic("Main Page")
    @Owner(value = "Frolova Nadezhda")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка перехода на страницу с регистрацией соискателя")
    @Test
    void resumeCreation() {
        step("На главной странице нажать на кнопку 'Создать резюме'", () ->
                mainPage.openHh().createResume());
        step("Переход на страницу с регистрацией соискателя", () ->
                resultsPage.checkRegistrationPageOpens());
    }
}

