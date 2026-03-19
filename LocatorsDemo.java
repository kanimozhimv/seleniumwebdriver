package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://www.demoblaze.com/index.html");
		
		 //Thread.sleep(2000);
		
		//WebElement searchBox = driver.findElement(By.name("search"));
		
		//searchBox.sendKeys("MacBook");

		driver.findElement(By.name("search")).sendKeys("MackBook");
	}

}
