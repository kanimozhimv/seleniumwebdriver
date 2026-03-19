package Automation_script;


	
	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class GoogleSearchDemo {
		
	public static void main(String[] args) {
		
	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	WebDriver driver = new ChromeDriver();

	driver.get("https://demoqa.com/text-box");

	//WebElement searchBox = driver.findElement(By.title("Search"));
	WebElement FullName = driver.findElement(By.id("userName"));
	//System.out.println(searchBox.getAttribute("outerHTML"));
	FullName.sendKeys("Kanimozhi");
	// Click Submit
	WebElement submitButton = driver.findElement(By.id("submit"));
	submitButton.click();

	// Wait until output appears
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

	// Validate output
	WebElement nameOutput = driver.findElement(By.id("name"));
	if(nameOutput.getText().contains("Kanimozhi")) {
	    System.out.println("Test Passed");
	} else {
	    System.out.println("Test Failed");
	}

	driver.quit();}}


