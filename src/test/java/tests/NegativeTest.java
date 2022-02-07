package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeTest {
    @Test
    public void Login() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        Pages pages=new Pages();
        pages.usernameKutusu.sendKeys(ConfigReader.getProperty("NegativeName"));
        pages.passwordKutusu.sendKeys(ConfigReader.getProperty("Password"));
        pages.loginButonu.click();
        Assert.assertEquals(pages.alert.getText(),"Epic sadface: Sorry, this user has been locked out.","Hatali username" );

    }
}
