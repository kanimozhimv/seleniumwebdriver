package day21;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chromium.ChromiumDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		

		String act_title=driver.getTitle();
		
		if(act_title.equals("The Internet"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();
		

	}

}

