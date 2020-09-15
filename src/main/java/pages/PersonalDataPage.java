package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class PersonalDataPage {

    By inputFirstName = By.cssSelector("[name='firstName']");
    By inputSureName = By.xpath("//input[@name='lastName']");
    By inputUploadPhoto = By.cssSelector("input[type='file']");
    By buttonZapisz = By.xpath("//*[text()='Zapisz']");

    private WebDriver driver;

    public PersonalDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String name) {
        driver.findElement(inputFirstName).sendKeys(name);
    }

    public void setSurname(String surname) {
        driver.findElement(inputSureName).sendKeys(surname);
    }

    public void uploadPhoto(String path) {
        File file = new File(path);
        driver.findElement(inputUploadPhoto).sendKeys(file.getAbsolutePath());
        driver.findElement(buttonZapisz).click();
    }
}