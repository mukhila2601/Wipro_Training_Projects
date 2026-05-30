package CrossBrowserDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class CrossBrowserTest {

	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Opened");
		} 
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			System.out.println("Edge Browser Opened");
		}

		Thread.sleep(3000);

		driver.manage().window().maximize();
		System.out.println("Browser Maximized");

		Thread.sleep(3000);
	}

	@Test
	public void openGoogle() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo Website Opened");

		Thread.sleep(3000);

		System.out.println("Title is: " + driver.getTitle());

		Thread.sleep(3000);
	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {

		Thread.sleep(3000);

		driver.quit();
		System.out.println("Browser Closed");
	}
}