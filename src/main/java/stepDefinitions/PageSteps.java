package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.MainPage;
import pages.PersonalDataPage;

import java.util.concurrent.TimeUnit;

public class PageSteps implements En {
    private WebDriver driver;
    MainPage mainPage;
    PersonalDataPage personalDataPage;

    public PageSteps() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //blablabla

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
