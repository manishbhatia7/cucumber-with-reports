package bindings;

import cucumber.api.java.en.And;
import pageobjects.deleteCustomerPage;

public class deleteCustomer extends base {
    @And("click on Delete button")
    public void click_on_Delete_button() throws InterruptedException {
        dcp=new deleteCustomerPage(driver);
        dcp.clickDeleteonPage();
    }

    @And("on alert confirm the deletion")
    public void on_alert_confirm_the_deletion() throws InterruptedException {
        dp=dcp.clickDeleteonAlertPage();
    }
}
