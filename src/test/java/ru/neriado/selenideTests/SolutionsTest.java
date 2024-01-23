package ru.neriado.selenideTests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsTest extends TestBase {

    @Test
    void solutionTestGitHub() {
        open("https://github.com");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(".border-bottom").$(byText("Enterprise")).click();
        $(".enterprise-hero-background").shouldHave(text("To build, scale, and deliver secure software."));
    }
}
