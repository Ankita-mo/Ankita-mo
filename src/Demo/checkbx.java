package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbx extends Base{
public static void main(String[] args) {
		
		System.setProperty(driver_name,driver_path);
		driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> checkbox= driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		for(int i=0;i<checkbox.size();i++) {
			
			//String val=checkbox.get(i).getAttribute("value");
			
			//if(val.equalsIgnoreCase("option2"))
			
			
				
				checkbox.get(i).click();
		}
		
		
		
	}


}
