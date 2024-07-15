package Locators.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;

public class UsingLinkNameAndId {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By emailLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("wrongemail@gmail.com");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Mnopq12345!");

        By loginBtnLocator = By.id("loginBtn");
        WebElement loginBtnElement = driver.findElement(loginBtnLocator);
        loginBtnElement.click();

        Thread.sleep(1000);

        // getText() Will return text of an element
        By errorLocator = By.className("error");
        WebElement errorElement = driver.findElement(errorLocator);
        String errorText = errorElement.getText();

        System.out.println(errorText);

        driver.quit();
    }
}
