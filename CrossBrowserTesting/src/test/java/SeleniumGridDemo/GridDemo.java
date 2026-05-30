//package SeleniumGridDemo;
//
//import java.net.URL;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//public class GridDemo {
//
//	WebDriver driver;
//
//	@Parameters("browser")
//	@Test
//	public void openSauceDemo(String browser) throws Exception {
//
//		if (browser.equalsIgnoreCase("chrome")) {
//
//			ChromeOptions options = new ChromeOptions();
//
//			driver = new RemoteWebDriver(
//					new URL("http://localhost:4444"),
//					options);
//		}
//
//		else if (browser.equalsIgnoreCase("edge")) {
//
//			EdgeOptions options = new EdgeOptions();
//
//			driver = new RemoteWebDriver(
//					new URL("http://localhost:4444"),
//					options);
//		}
//
//		driver.manage().window().maximize();
//
//		Thread.sleep(3000);
//
//		driver.get("https://www.saucedemo.com/");
//
//		Thread.sleep(3000);
//
//		System.out.println("Title is: " + driver.getTitle());
//
//		Thread.sleep(3000);
//
//		//driver.quit();
//	}
//}


package SeleniumGridDemo;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridDemo {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void openSauceDemo(String browser) throws Exception {

		if (browser.equalsIgnoreCase("chrome")) {

			ChromeOptions options = new ChromeOptions();

			driver = new RemoteWebDriver(
					new URL("http://localhost:4444"),
					options);

			System.out.println("Chrome Browser Opened");
		}

		else if (browser.equalsIgnoreCase("edge")) {

			EdgeOptions options = new EdgeOptions();

			driver = new RemoteWebDriver(
					new URL("http://localhost:4444"),
					options);

			System.out.println("Edge Browser Opened");
		}

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.get("https://www.saucedemo.com/");

		System.out.println("SauceDemo Website Opened");

		Thread.sleep(3000);

		driver.findElement(By.id("user-name"))
				.sendKeys("standard_user");

		System.out.println("Username Entered");

		Thread.sleep(3000);

		driver.findElement(By.id("password"))
				.sendKeys("secret_sauce");

		System.out.println("Password Entered");

		Thread.sleep(3000);

		driver.findElement(By.id("login-button")).click();

		System.out.println("Login Button Clicked");

		Thread.sleep(3000);

		String currentUrl = driver.getCurrentUrl();

		if (currentUrl.contains("inventory.html")) {

			System.out.println(browser + " -> Login Successful");
		}

		else {

			System.out.println(browser + " -> Login Failed");
		}

		Thread.sleep(5000);

		driver.quit();

		System.out.println("Browser Closed");
	}
}