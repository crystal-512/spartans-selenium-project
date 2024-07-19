package tek.review.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class Activity1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#signinLink")))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='email']")))
                .sendKeys("crystal.a512@gmail.com");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='password']")))
                .sendKeys("CC234cc!");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".login__submit")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("accountLink")))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='phoneNumber']")))
                .sendKeys("555-222-1234");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#personalUpdateBtn")))
                .click();

        WebElement updateElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".Toastify")));
        System.out.println(updateElement.getText());

        driver.quit();


    }
}
