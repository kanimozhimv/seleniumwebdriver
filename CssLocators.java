package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		//Tagandid
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		
		
		//Tag and classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Clothes");
		
		

	}

}
