package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.*;


public class _08_Alpaslan {

    DialogContent dc=new DialogContent();
    @Given("Navigate to Request Loan Page")
    public void navigateToRequestLoanPage() {
        dc.myClick(dc.requestLoanPageLink);

    }

    @Then("Enter Load Amount, Down Payment, Select Accunt ID and Submit")
    public void enterLoadAmountDownPaymentSelectAccuntIDAndSubmit() {
        dc.mySendKeys(dc.loanAmountBox,"1000");
        dc.mySendKeys(dc.downPaymentBox, "100");
        dc.selectEngineByID("fromAccountId", 0);
        dc.myClick(dc.submitButton);
    }

    @And("User Loan Request Result should be succesfully displayed")
    public void userLoanRequestResultShouldBeSuccesfullyDisplayed() {
        dc.verifyContainsText(dc.loanRequestStatus, "approved");
        System.out.println("dc = " + dc.loanRequestStatus.getText());
      //  dc.verifyContainsText(dc.loanRequestStatus, "Denied");


    }
}
