package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButtons {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement male_id = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female_id = driver.findElement(By.xpath("//input[@id='female']"));
		
		System.out.println("Before selection");
		
		System.out.println(male_id.isSelected());
		System.out.println(female_id.isSelected());
		System.out.println(male_id.isEnabled());
		System.out.println(female_id.isEnabled());
		
		male_id.click();
		
		System.out.println(male_id.isSelected());
		System.out.println(female_id.isSelected());
		System.out.println(male_id.isEnabled());
		
		
		//driver.findElement(By.xpath("//input[@id='male']")).click();

	}

}
