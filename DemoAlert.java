//Handling alert message 

package day30;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAlert {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // Open demo alert page
            driver.get("https://demoqa.com/alerts");

            // Click button to trigger alert
            driver.findElement(By.id("alertButton")).click();

            // Wait explicitly for alert
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.alertIsPresent());
            
            //Thread.sleep(2000);

            // Switch to alert and accept
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert message: " + alert.getText());
            alert.accept();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}