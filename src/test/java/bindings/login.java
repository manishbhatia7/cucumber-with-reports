package bindings;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public WebDriver driver;
    @Before
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("user launches the application")
    public void user_launches_the_application() {

        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FCustomer%2FList");
    }

    @And("enters username as {string}")
    public void enters_username_as(String username) {
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(username);
    }

    @And("password as {string}")
    public void password_as(String password) {
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("click on submit button")
    public void click_on_submit_button() {
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
    }

    @Then("login should be successful")
    public void login_should_be_successful() {
        Assert.assertEquals(driver.getTitle(),"Customers / nopCommerce administration");
    }
}
