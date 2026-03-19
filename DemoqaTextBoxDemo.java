package Automation_script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoqaTextBoxDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        // Fill Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Kanimozhi");

        // Fill Email
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("kanimozhi@example.com");

        // Fill Current Address
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Fairfax, Virginia");

        // Fill Permanent Address
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Fairfax, Virginia");

        // Wait until Submit button is present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));

        // Press ENTER on Submit button instead of clicking
        submitButton.sendKeys(Keys.ENTER);

        // Wait until output is visible
        WebElement outputName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        WebElement outputEmail = driver.findElement(By.id("email"));
        WebElement outputCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        WebElement outputPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));

        // Validate each field
        if (outputName.getText().contains("Kanimozhi")) System.out.println("Name Test Passed");
        else System.out.println("Name Test Failed");

        if (outputEmail.getText().contains("kanimozhi@example.com")) System.out.println("Email Test Passed");
        else System.out.println("Email Test Failed");

        if (outputCurrentAddress.getText().contains("Fairfax, Virginia")) System.out.println("Current Address Test Passed");
        else System.out.println("Current Address Test Failed");

        if (outputPermanentAddress.getText().contains("Fairfax, Virginia")) System.out.println("Permanent Address Test Passed");
        else System.out.println("Permanent Address Test Failed");

        driver.quit();
    }
}