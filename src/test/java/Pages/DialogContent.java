package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public WebElement CreateAccount;

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
    @FindBy(xpath = "//input[@id = 'customer.phoneNumber']")
    public WebElement phone;
    @FindBy(xpath = "//input[@id = 'customer.ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//input[@id = 'customer.username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id = 'customer.password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id = 'repeatedPassword']")
    public WebElement confirm;
    @FindBy(xpath = " //input[@value= 'Register']")
    public WebElement REGISTER;
    @FindBy(xpath = " //h1[@class= 'title']")
    public WebElement verifyLogin;


    //****************************US_02************************





    //****************************US_03************************







    //****************************US_04************************




    //****************************US_05************************






    //****************************US_06************************




    //****************************US_07************************







    //****************************US_08************************




}