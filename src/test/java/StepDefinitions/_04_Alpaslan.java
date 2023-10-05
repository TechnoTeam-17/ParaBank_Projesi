package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_Alpaslan {

    DialogContent dc=new DialogContent();
    @io.cucumber.java.en.Given("Naviga to Open New Account Page")
    public void navigaToOpenNewAccountPage() {
        dc.myClick(dc.openNewAccount);

    }

    @Then("Select Account Type and Account ID and Submit")
    public void selectAccountTypeAndAccountIDAndSubmit() {
        dc.selectEngineByID("type",0);
        dc.selectEngineByID("fromAccountId",0);
        dc.myClick(dc.submitOpenNewAccountButton);

    }

    @And("Use account should succesfully opened")
    public void useAccountShouldSuccesfullyOpened() {
        dc.verifyContainsText(dc.accountOpenedBox, "Account Opened!");
    }
}
