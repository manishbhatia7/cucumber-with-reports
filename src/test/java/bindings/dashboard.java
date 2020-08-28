package bindings;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.addCustomerPage;
import pageobjects.dashboardPage;
import pageobjects.deleteCustomerPage;

public class dashboard extends base {

    @Given("I have already logged into application")
    public void i_have_already_logged_into_application() {

        dp = new dashboardPage(driver);
    }

    @When("I click on Parent customer link")
    public void i_click_on_Parent_customer_link() {
        dp.click_Parent_Customer_link();
    }

    @When("I click on child customer link")
    public void i_click_on_child_customer_link() {
        dp.click_Child_Customer_link();
    }

    @Then("Add Customer button should be visible")
    public void add_Customer_button_should_be_visible() {
        dp.assert_Button_is_Visible();
    }

    @When("I type {string} in Email textbox")
    public void i_type_in_Email_textbox(String email) {
        dp = new dashboardPage(driver);
        dp.enterEmailId(email);
    }

    @When("click on search button")
    public void click_on_search_button() {
        dp.clickSearchButton();
    }

    @Then("I should be able to click on edit button")
    public void i_should_be_able_to_click_on_edit_button() throws InterruptedException {
        dcp=dp.clickEditButton();
    }
    @And("^I type \"([^\"]*)\" second time in Email textbox$")
    public boolean i_type_something_second_time_in_email_textbox(String email) throws Throwable {
        dp=new dashboardPage(driver);
        Thread.sleep(5000);
        boolean result = false;
        int attempts = 0;
        while(attempts < 2) {
            try {
                dp.enterSecondEmailId(email);
                dp.clickSearchButton();
                result = true;
                break;
            } catch(Exception e) {
            }
            attempts++;
        }
        return result;

    }
    @Then("record should be deleted")
    public void record_should_be_deleted() throws InterruptedException {
        dp.assertMessage();
        dp.assertEmptyRow();

    }
}
