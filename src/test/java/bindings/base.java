package bindings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.addCustomerPage;
import pageobjects.dashboardPage;
import pageobjects.deleteCustomerPage;
import pageobjects.loginPage;


public class base {
    public static Logger logger;
    public static WebDriver driver;
    public static WebDriverWait wait;
    dashboardPage dp;
    loginPage lp;
    addCustomerPage acp;
    deleteCustomerPage dcp;

    public void initaliseBrowser(String browser)
    {
        switch(browser)
        {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            case "IE":
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                break;
            default:
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();

        }
        driver.manage().window().maximize();

    }
    public void waitForVisibility(WebElement element) throws Error{
        new WebDriverWait(driver, 30)
                .until(ExpectedConditions.visibilityOf(element));
    }
    public String random_string()
    {
        String  alphabet=RandomStringUtils.randomAlphabetic(4);
        String email=alphabet+"@"+"gmail.com";
        return email;

    }


}
