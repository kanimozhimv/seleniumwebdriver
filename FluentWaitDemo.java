package day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // FluentWait setup
        Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        // Wait until the container div of username input is present
        WebElement usernameInput = myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                // Full CSS path that works on React page
                WebElement el = driver.findElement(By.cssSelector(
                    "div.orangehrm-login-form input[name='username']"
                ));
                if (el.isDisplayed()) {
                    return el;
                } else {
                    return null;
                }
            }
        });

        usernameInput.sendKeys("Admin");

        WebElement passwordInput = myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement el = driver.findElement(By.cssSelector(
                    "div.orangehrm-login-form input[name='password']"
                ));
                if (el.isDisplayed()) {
                    return el;
                } else {
                    return null;
                }
            }
        });
        passwordInput.sendKeys("admin123");

        WebElement loginButton = myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement el = driver.findElement(By.cssSelector(
                    "div.orangehrm-login-form button[type='submit']"
                ));
                if (el.isDisplayed() && el.isEnabled()) {
                    return el;
                } else {
                    return null;
                }
            }
        });

        loginButton.click();

        System.out.println("Login attempted successfully!");
        driver.quit();
    }
}