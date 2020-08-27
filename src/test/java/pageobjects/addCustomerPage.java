package pageobjects;

import bindings.base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addCustomerPage extends base {
    WebDriver ldriver;
    public addCustomerPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
     @FindBy(xpath="//a[@class='btn bg-blue']")
    @CacheLookup
    private WebElement btn_add_customer;

    @FindBy(id="Email")
    @CacheLookup
    private WebElement txtEmail;

    @FindBy(id="Password")
    @CacheLookup
    private WebElement txtPassword;

    @FindBy(id="FirstName")
    @CacheLookup
    private WebElement txtFirstName;

    @FindBy(id="LastName")
    @CacheLookup
    private WebElement txtLastName;

    @FindBy(xpath="//input[@id='Gender_Male']")
    @CacheLookup
    private WebElement rdGender;

    @FindBy(id="DateOfBirth")
    @CacheLookup
    private WebElement txtDob;

    @FindBy(id="SelectedNewsletterSubscriptionStoreIds_taglist")
    @CacheLookup
    private WebElement mselectNewsletter_2;

    @FindBy(name="save")
    @CacheLookup
    private WebElement btnSubmit;

    @FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
    @CacheLookup
    private WebElement msg_Success;

   public void enterEmail(String email)
    {
        waitForVisibility(txtEmail);
        txtEmail.sendKeys(email);
    }

    public void enterPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void enterFirstName(String fname)
    {
        txtFirstName.sendKeys(fname);
    }

    public void enterLastName(String lname)
    {
        txtLastName.sendKeys(lname);
    }
    public void selectGender()
    {
        rdGender.click();
    }
    public void enterDOB(String dob)
    {
        txtDob.sendKeys(dob);
    }

   public void assertRegistrationSuccessful()
    {
        Assert.assertTrue(msg_Success.isDisplayed());

    }

    public dashboardPage save_Data()
    {
        btnSubmit.click();
        return new dashboardPage(ldriver);
    }

}

