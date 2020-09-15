package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.PersonalDataPage;

import java.util.concurrent.TimeUnit;

public class PageSteps implements En {
    private WebDriver driver;
    MainPage mainPage;
    PersonalDataPage personalDataPage;

    public PageSteps() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        mainPage = new MainPage(driver);
        personalDataPage = new PersonalDataPage(driver);

        Given("I open application", () -> {
            driver.get("https://app.interviewme.pl/template/concept");
            mainPage.createCV();
        });

        When("I set the name {string}", (String name) -> {
            personalDataPage.setName(name);
        });

        When("I set the surname {string}", (String surname) -> {
            personalDataPage.setSurname(surname);
        });

        Then("The name {string} is visible in preview", (String name) -> {

        });

        Then("The surname {string} is visible in preview", (String surname) -> {

        });


    }
}
