package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatXpth {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankita.Mohamanasingh\\eclipse-workspace\\selenium\\seleniumPractise\\drivers\\chromeDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Ankita@123");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

}
