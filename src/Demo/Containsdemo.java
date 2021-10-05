package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containsdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\Ankita.Mohamanasingh\\eclipse-workspace\\selenium\\seleniumPractise\\drivers\\chromeDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//*[contains (@id,'username')]")).sendKeys("Ankita@123");
		
		driver.findElement(By.xpath("//*[contains (@id,'password')]")).sendKeys("12345");
		
		driver.findElement(By.xpath("//[contains(@id,'Login')]")).click();

	}

}
