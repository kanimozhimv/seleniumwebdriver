package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	
	public static void main (String args[]) {
		
	

	
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demo.nopcommerce.com");
	
}
}