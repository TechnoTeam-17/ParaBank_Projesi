package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='register.htm']")
    public WebElement Registerbutton;
    @FindBy(xpath = "//input[@id ='customer.firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id ='customer.lastName']")
    public WebElement lastName;
    @FindBy(xpath="//input[@id = 'customer.address.street']")
    public WebElement adress;
    @FindBy(xpath = "//input[@id = 'customer.address.city']")
    public WebElement city;
    @FindBy(xpath = "//input[@id = 'customer.address.state']")
    public WebElement state;
    @FindBy(xpath = "//input[@id = 'customer.address.zipCode']")
    public WebElement zipcode;
    @FindBy(xpath = "//input[@id = 'customer.address.phoneNumber']")
    public WebElement phone;
    @FindBy(xpath = "//input[@id = 'customer.address.ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//input[@id = 'customer.address.username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id = 'customer.address.password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id = 'repeatedPassword']")
    public WebElement confirm;
    @FindBy(xpath = " //input[@value= 'Register']")
    public WebElemet register;
    @FindBy(xpath = "//p[contains(text(),' Your account was created successfully. You are now logged in.')]")
    public WebElement verifyLogin;

}