package pageobjects;

import bindings.base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage extends base {
    WebDriver ldriver;

    public dashboardPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath="(//span[contains(text(),'Customers')])[1]")
    @CacheLookup
    private WebElement lnk_Main_Customer;

    @FindBy(xpath="(//span[contains(text(),'Customers')])[2]")
    @CacheLookup
    private WebElement lnk_Child_Customer;

    @FindBy(xpath="//a[@class='btn bg-blue']")
    @CacheLookup
    private WebElement btn_add_customer;
    public void click_Parent_Customer_link()
    {
        waitForVisibility(lnk_Main_Customer);
        lnk_Main_Customer.click();
    }
    public void click_Child_Customer_link()
    {
        lnk_Child_Customer.click();
    }
    public void assert_Button_is_Visible()
    {
        waitForVisibility(btn_add_customer);
        Assert.assertTrue(btn_add_customer.isDisplayed());
    }
    public addCustomerPage click_on_addcustomer_button()
    {
        btn_add_customer.click();
        return new addCustomerPage(ldriver);
    }
}
