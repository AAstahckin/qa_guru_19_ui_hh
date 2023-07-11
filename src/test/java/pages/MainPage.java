package pages;


import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends TestBase {

    public MainPage openHh() {
        open("");
        return this;
    }

    public MainPage clickSearchButton() {
        $("[data-qa=search-button]").click();
        return this;
    }

    public MainPage searchVacancy(String vacancies) {
        $("#a11y-search-input").setValue(vacancies).pressEnter();
        return this;
    }

    public MainPage createResume() {
        $("[data-qa=signup]").shouldHave(text("Создать резюме")).click();
        return this;
    }

    public MainPage clickExpertResumeButton() {

        $("[data-qa=mainmenu_expertresume]").click();
        return this;
    }
}


