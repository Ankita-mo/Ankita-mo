package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankita.Mohamanasingh\\eclipse-workspace\\selenium\\seleniumPractise\\drivers\\chromeDriver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
//driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		
		
	

	}

}
