package Day_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Expand all']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Desktop']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Documents']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();

		Thread.sleep(2000);
		String result = driver.findElement(By.id("result")).getText();
		Thread.sleep(3000);
		System.out.println("===== Selected Checkbox Result =====");
		System.out.println(result);
		if(result.contains("desktop"))
		{
			System.out.println("Desktop Checkbox Validation Passed");
		}
		else
		{
			System.out.println("Desktop Checkbox Validation Failed");
		}

		if(result.contains("documents"))
		{
			System.out.println("Documents Checkbox Validation Passed");
		}
		else
		{
			System.out.println("Documents Checkbox Validation Failed");
		}

		if(result.contains("downloads"))
		{
			System.out.println("Downloads Checkbox Validation Passed");
		}
		else
		{
			System.out.println("Downloads Checkbox Validation Failed");
		}
		System.out.println("Page Title : " + driver.getTitle());

		System.out.println("Current URL : " + driver.getCurrentUrl());

		driver.quit();
	}
}