import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.PersonalDataPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class InterviewMe {
    private WebDriver driver;
    MainPage mainPage;
    PersonalDataPage personalDataPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://app.interviewme.pl/template/concept");
        mainPage = new MainPage(driver);
        personalDataPage = new PersonalDataPage(driver);
    }

    @Test
    public void FillDataTest()  {
        mainPage.createCV();
        personalDataPage.setName("Piotr");
        personalDataPage.setSurname("Wisniewski");
        personalDataPage.uploadPhoto("src\\main\\resources\\elmo.png");

    }

    @After
    public void tearDown() {
      //  driver.close();
    }
}


