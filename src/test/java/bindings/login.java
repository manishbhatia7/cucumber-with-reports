package bindings;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjects.loginPage;


public class login extends base {
    @Before
    public void setup()
    {
        logger=Logger.getLogger("Cucumber Project");
        PropertyConfigurator.configure("Log4j.properties");
        logger.setLevel(Level.DEBUG);
    }




    @When("user launches the application")
    public void user_launches_the_application() {

        initaliseBrowser("Chrome");
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FCustomer%2FList");
        lp=new loginPage(driver);
        logger.info("Application launched");
    }

    @And("enters username as {string}")
    public void enters_username_as(String username) {
        logger.info("Email textbox cleared and entered");
        lp.enterUserName(username);
    }

    @And("password as {string}")
    public void password_as(String password) {
        lp.enterPassword(password);
    }

    @And("click on submit button")
    public void click_on_submit_button()
    {
       dp=lp.submitCredentials();
    }

    @Then("login should be successful")
    public void login_should_be_successful() {
        Assert.assertEquals(driver.getTitle(),"Customers / nopCommerce administration");
    }
}
