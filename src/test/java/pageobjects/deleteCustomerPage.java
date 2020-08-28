package pageobjects;

import bindings.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deleteCustomerPage extends base {
    public WebDriver ldriver;
    public deleteCustomerPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//span[@id='customer-delete']")
    @CacheLookup
    private WebElement btnDelete;

    @FindBy(xpath="//button[@class='btn bg-red pull-right']")
    @CacheLookup
    private WebElement btnAlertDelete;

    public void clickDeleteonPage()
    {
        waitForVisibility(btnDelete);
        btnDelete.click();
    }

    public dashboardPage clickDeleteonAlertPage()
    {
        waitForVisibility(btnAlertDelete);
        btnAlertDelete.click();
        return new dashboardPage(ldriver);
    }


}
