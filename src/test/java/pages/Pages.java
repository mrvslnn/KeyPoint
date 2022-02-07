package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Pages {
    public WebDriver driver;

    public Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//input[@id='user-name']")
    public WebElement usernameKutusu;
    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordKutusu;
    @FindBy(xpath="//input[@id='login-button']")
    public WebElement loginButonu;
    @FindBy(xpath="//div[@class='error-message-container error']")
    public WebElement alert;


}
