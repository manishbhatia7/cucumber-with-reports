package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.addCustomerPage;
import pageobjects.dashboardPage;

public class dashboard extends base {

        @Given("I have already logged into application")
        public void i_have_already_logged_into_application() {

           dp=new dashboardPage(driver);
        }

        @When("I click on Parent customer link")
        public void i_click_on_Parent_customer_link() {
           dp.click_Parent_Customer_link();
        }

        @When("I click on child customer link")
        public void i_click_on_child_customer_link()
        {
            dp.click_Child_Customer_link();
        }

        @Then("Add Customer button should be visible")
        public void add_Customer_button_should_be_visible() {
            dp.assert_Button_is_Visible();
        }


    }
