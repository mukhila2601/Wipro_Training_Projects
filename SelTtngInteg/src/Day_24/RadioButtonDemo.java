package Day_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/radio-button");

		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();

		Thread.sleep(2000);

		String yesResult = driver.findElement(By.className("text-success")).getText();

		System.out.println("Selected Radio Button : " + yesResult);

		if(yesResult.equals("Yes"))
		{
			System.out.println("Yes Radio Button Validation Passed");
		}
		else
		{
			System.out.println("Yes Radio Button Validation Failed");
		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();

		Thread.sleep(2000);

		String impressiveResult = driver.findElement(By.className("text-success")).getText();

		System.out.println("Selected Radio Button : " + impressiveResult);

		if(impressiveResult.equals("Impressive"))
		{
			System.out.println("Impressive Radio Button Validation Passed");
		}
		else
		{
			System.out.println("Impressive Radio Button Validation Failed");
		}

		boolean noRadio = driver.findElement(By.id("noRadio")).isEnabled();

		if(noRadio == false)
		{
			System.out.println("No Radio Button is Disabled");
		}
		else
		{
			System.out.println("No Radio Button is Enabled");
		}

		// Print Title and URL
		System.out.println("Page Title : " + driver.getTitle());

		System.out.println("Current URL : " + driver.getCurrentUrl());

		driver.quit();
	}
}