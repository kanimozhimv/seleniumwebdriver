package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	
	public static void main (String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//get(url) - opens the url on the browser

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//get title of current web page and print in console 
		
		System.out.println(driver.getTitle());
		
		//get the current url of webpage
		
		System.out.println(driver.getCurrentUrl());
		
		//get pagesource 
		
		//System.out.println(driver.getPageSource());
		
		//get window handle - return id of the browser window 
		
		//String windowid = driver.getWindowHandle();
		
		//System.out.println("Window ID"+windowid );
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();//this opens another browser window 
		
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		
		
	}

}
