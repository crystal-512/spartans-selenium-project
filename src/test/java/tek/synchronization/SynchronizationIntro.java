package tek.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SynchronizationIntro {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("signinLink")));
        element.click();

        WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        inputElement.sendKeys("WrongInput@gmail.com");

        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passwordElement.sendKeys("wrongpassword");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("LoginBtn"))).click();

        WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("error")));
        System.out.println(errorElement.getText());

        driver.quit();


    }
}
