package day30;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLogoSimple {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://ui.vision/demo/webtest/frames/");

            // 1️⃣ Switch to 5th frame (index starts at 0)
            driver.switchTo().frame(4);

            // 2️⃣ Click the link using its exact href (simplest way)
            WebElement link = driver.findElement(By.cssSelector("a[href='frame_5_inner.html']"));
            link.click();

            // 3️⃣ Check logo presence inside the same frame
            WebElement logo = driver.findElement(By.cssSelector("img[src*='logo']"));

            if (logo.isDisplayed()) {
                System.out.println("Logo is present in the frame ✔");
            } else {
                System.out.println("Logo is NOT present in the frame ❌");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}