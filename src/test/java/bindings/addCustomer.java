package bindings;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.addCustomerPage;
import pageobjects.dashboardPage;

public class addCustomer extends base {
    @When("I click on Add new customer button")
    public void i_click_on_Add_new_customer_button() throws InterruptedException
    {
        dp=new dashboardPage(driver);
        dp.click_on_addcustomer_button();
    }
    @When("I enter Email as {string}")
    public void i_enter_Email_as(String email) {
        acp=new addCustomerPage(driver);
        acp.enterEmail(email);
    }


    @When("I enter Password as {string}")
    public void i_enter_Password_as(String password) {
        acp.enterPassword(password);
    }

    @When("I enter FirstName as {string}")
    public void i_enter_FirstName_as(String fname) {
        acp.enterFirstName(fname);

    }

    @When("I enter LastName as {string}")
    public void i_enter_LastName_as(String lname) {
        acp.enterLastName(lname);

    }

    @When("I select Gender")
    public void i_select_Gender() {
        acp.selectGender();

    }

    @When("I enter  DOB as {string}")
    public void i_enter_DOB_as(String dob) {
        acp.enterDOB(dob);
    }


    @When("I click on save")
    public void i_click_on_save() {
        dp=acp.save_Data();

    }

    @Then("New customer should be added")
    public boolean new_customer_should_be_added() {
        boolean result = false;
        int attempts = 0;
        while(attempts < 2) {
            try {
                dp.assert_Button_is_Visible();
                result = true;
                break;
            } catch(Exception e) {
            }
            attempts++;
        }
        return result;
    }

}
