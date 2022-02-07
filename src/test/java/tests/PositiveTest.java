package tests;

import org.testng.annotations.Test;
import pages.Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveTest {
    @Test
    public void Login() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        Pages pages=new Pages();
        pages.usernameKutusu.sendKeys(ConfigReader.getProperty("PositiveName"));
        pages.passwordKutusu.sendKeys(ConfigReader.getProperty("Password"));
        pages.loginButonu.click();

    }
}
