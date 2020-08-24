package bindings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
    public static Logger logger;
    public static WebDriver driver;

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

}
