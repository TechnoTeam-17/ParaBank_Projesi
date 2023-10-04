package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

public class _03_FaturaOdeme {

    DialogContent dc=new DialogContent();

    @When("Enter username and password and click login button")
    public void login() {
        dc.myClick(dc.BillPay);
        dc.mySendKeys(dc.PayeeName, "Mina");
        dc.mySendKeys(dc.Address, "America");
        dc.mySendKeys(dc.City, "Los-Angeles");
        dc.mySendKeys(dc.State, "California");
        dc.mySendKeys(dc.ZipCode, "CA555");
        dc.mySendKeys(dc.Phone, "555-555-555");
        dc.mySendKeys(dc.Account, "12345");
        dc.mySendKeys(dc.VerifyAccount, "12345");
        dc.mySendKeys(dc.Amount, "100");
        dc.mySendKeys(dc.FromAccountt, "Mina");
        dc.myClick(dc.SendPayment);

    }
    @Then("Bill Payment was successful")
    public void billpayment(){dc.verifyContainsText(dc.verifyLogin,"Bill Payment Complete");}

    @Given("Navigate to parabank")
    public void navigateToParabank() {

    }

    @When("Click Bill Payment Service")
    public void clickBillPaymentService() {
    }

    @Then("Enter payee information")
    public void enterPayeeInformation() {
    }

    @And("Send Payment")
    public void sendPayment() {
    }
}
