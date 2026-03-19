package day30;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Normal alert with ok button 
		
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click(); // opens alert box
		
		Thread.sleep(5000);
		
		//Alert myalert = driver.switchTo().alert();

		driver.switchTo().alert().accept();
		
		//confirmation alert ok and cancel*/
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		//Thread.sleep(5000);
		
		//driver.switchTo().alert().accept(); //close alert window using ok alert button
	
		//driver.switchTo().alert().dismiss();//close alert window using cancel alert button
		
		//prompt alert - input box
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();//opens the alert window
		
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		System.out.println("Text message on alert" + myalert.getText());
		myalert.sendKeys("Kani");
		myalert.accept();
		
		String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		if(result.contains("Kani")) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		}
		
		
	}


