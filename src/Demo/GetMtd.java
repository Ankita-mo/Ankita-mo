package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMtd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankita.Mohamanasingh\\eclipse-workspace\\selenium\\seleniumPractise\\drivers\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());
		
	}

}
