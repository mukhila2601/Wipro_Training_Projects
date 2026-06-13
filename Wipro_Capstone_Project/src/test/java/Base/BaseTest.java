package Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Utilities.ConfigReader;
import Utilities.DriverFactory;
public class BaseTest {

    protected WebDriver driver;
    protected Logger logger =
            LogManager.getLogger(this.getClass());
    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initializeDriver();
        driver.get(
                ConfigReader.getProperty("url"));
    }
    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }
    public WebDriver getDriver() {
        return driver;
    }
}