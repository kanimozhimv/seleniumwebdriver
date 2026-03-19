package day30;

//Code to Print All Frames and Iframes

	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FramesDebug {

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://ui.vision/demo/webtest/frames/");

	        // find all frames
	        List<WebElement> frames = driver.findElements(By.tagName("frame"));

	        System.out.println("Total frames: " + frames.size());

	        for(int i = 0; i < frames.size(); i++) {
	            System.out.println(frames.get(i).getAttribute("src"));
	        }

	        driver.quit();
	    }
	}

