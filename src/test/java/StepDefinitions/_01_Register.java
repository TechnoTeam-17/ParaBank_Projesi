package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_Register  {

    DialogContent dc = new DialogContent();
    Faker fk = new Faker();

    @Given("Navigate To ParaBank")
    public void navigateToPrestaShop() {
        GWD.getDriver().get("https://para.testar.org/");
    }

    @When("Enter click Register in button")
    public void clickRegisterinbutton() {
    dc.myClick(dc.Registerbutton);
        //String emailfake=fk.name().username().concat("@gmail.com");
        //dc.mySendKeys(dc.userName,emailfake);
        //dc.myClick(dc.CreateAccount);
    }

    @Then("Enter Data in Text Box")
    public void enterEMailAdressAndPassword() {
        dc.mySendKeys(dc.firstName, "miriam");
        dc.mySendKeys(dc.lastName,"zeynep");
        dc.mySendKeys(dc.adress, "schulstrasse 1");
        dc.mySendKeys(dc.city,"Berlin");
        dc.mySendKeys(dc.state, "Deutschland");
        dc.mySendKeys(dc.zipcode,"13599");
        dc.mySendKeys(dc.phone, "0792222222");
        dc.mySendKeys(dc.ssn,"2023");
        dc.mySendKeys(dc.userName,"miriam");
        dc.mySendKeys(dc.password,"miriam2023");
        dc.mySendKeys(dc.confirm,"miriam2023");
                         }
    @And("Enter click Register")
    public void enterClickRegister() {
        String emailfake=fk.name().username().concat("@gmail.com");
        dc.mySendKeys(dc.userName,emailfake);
        dc.myClick(dc.CreateAccount);
        dc.myClick(dc.REGISTER);
    }
   @And("User should login successfully")
    public void userShouldLoginSuccessfully()throws InterruptedException {
        dc.verifyContainsText(dc.verifyLogin,"Welcome");
    }

    }

