package tek.locator.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#signinLink"))
                .click();

        driver.findElement(By.cssSelector("#newAccountBtn"))
                .click();

        driver.findElement(By.cssSelector("#nameInput"))
                .sendKeys("Crystal");

        driver.findElement(By.cssSelector("#emailInput"))
                .sendKeys("crystal.a512@gmail.com");

        driver.findElement(By.cssSelector("#passwordInput"))
                .sendKeys("CC234cc!");

        driver.findElement(By.cssSelector("#confirmPasswordInput"))
                .sendKeys("CC234cc!");

        driver.findElement(By.cssSelector(".signup__btn"))
                .click();

        driver.findElement(By.cssSelector("input[name='email']"))
                .sendKeys("crystal.a512@gmail.com");

        driver.findElement(By.cssSelector("input[name='password']"))
                .sendKeys("CC234cc!");

        driver.findElement(By.cssSelector(".login__submit"))
                .click();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#accountLink"))
                .click();

        String actualEmailText = driver.findElement(By.cssSelector("div.account__information-detail > h1:last-child"))
                .getText();

        Thread.sleep(3000);

        System.out.println(actualEmailText);

        driver.quit();










    }
}
