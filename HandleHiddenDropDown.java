package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");

        driver.manage().window().maximize();

        // Login
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // Click PIM
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        // Click dropdown
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[3]")).click();

        Thread.sleep(3000);

        // Get all options
        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));

        System.out.println("Number of options: " + options.size());

        // Print options
        for (WebElement op : options) {
            System.out.println(op.getText());
        }
    }
}