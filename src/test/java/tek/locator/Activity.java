package tek.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By createNewAccount = By.id("newAccountBtn");
        WebElement createNewAccountElement = driver.findElement(createNewAccount);
        createNewAccountElement.click();

        By nameLocator = By.name("name");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("John");

        By emailInputLocator = By.name("email");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys("myemail@gmail.com");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("123456mmmnN!");

        By confirmPasswordLocator = By.name("confirmPassword");
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordLocator);
        confirmPasswordElement.sendKeys("123456mmmnN!");

        By signUpLocator = By.className("signup__btn");
        WebElement signUpElement = driver.findElement(signUpLocator);
        signUpElement.click();

        Thread.sleep(3000);


        driver.quit();



    }
}
