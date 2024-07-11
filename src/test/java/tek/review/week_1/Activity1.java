package tek.review.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By createNewAccount = By.id("newAccountBtn");
        WebElement createNewAccountElement = driver.findElement(createNewAccount);
        createNewAccountElement.click();

        By nameLocator = By.id("nameInput");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("John");

        By emailInputLocator = By.id("emailInput");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys("mmm23@gmail.com");

        By passwordLocator = By.id("passwordInput");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("123456mmmnn");

        By confirmPasswordLocator = By.id("passwordInput");
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordLocator);
        confirmPasswordElement.sendKeys("123456mmmnn");

        By signUpLocator = By.id("newAccountBtn");
        WebElement signUpElement = driver.findElement(signUpLocator);
        signUpElement.click();

        By loginBtnLocator = By.id("loginBtn");
        WebElement loginBtnElement = driver.findElement(loginBtnLocator);
        loginBtnElement.click();
    }
}
