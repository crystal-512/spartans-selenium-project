package tek.locator.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityOneLine {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();


        driver.findElement(By.id("newAccountBtn")).click();

        driver.findElement(By.name("name")).sendKeys("John");

        driver.findElement(By.name("email")).sendKeys("myemail@gmail.com");

        driver.findElement(By.name("password")).sendKeys("123456mmmnN!");

        driver.findElement(By.name("confirmPassword")).sendKeys("123456mmmnN!");

        driver.findElement(By.className("signup__btn")).click();


        Thread.sleep(3000);


        driver.quit();
    }
}
