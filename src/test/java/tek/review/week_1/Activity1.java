package tek.review.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;


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
        String randomEmail = generateRandomString(10) + "@example.com";
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys(randomEmail);

        By passwordLocator = By.id("passwordInput");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("123456mmmnN!");

        By confirmPasswordLocator = By.id("confirmPasswordInput");
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordLocator);
        confirmPasswordElement.sendKeys("123456mmmnN!");

        By signUpLocator = By.id("signupBtn");
        WebElement signUpElement = driver.findElement(signUpLocator);
        signUpElement.click();

        Thread.sleep(3000);

        By profileImageLocator = By.id("profileImage");driver.quit();
        WebElement profileImageElement = driver.findElement(profileImageLocator);

        boolean isProfileDisplayed = profileImageElement.isDisplayed();

        if(isProfileDisplayed){
            System.out.println(" Image Displayed");
        }else { System.out.println(" Image not Displayed"); }

        driver.quit();

     }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(characters.charAt(random.nextInt(characters.length())));
        }
        return stringBuilder.toString();

    }









    }

