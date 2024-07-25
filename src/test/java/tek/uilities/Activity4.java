package tek.uilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Activity4 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        SeleniumUtility utility = new SeleniumUtility(driver);
        utility.clickOnElement(By.linkText("Sign in"));

        utility.sendTextToElement(By.name("email"),"wrong@gmail.com");
        utility.sendTextToElement(By.name("password"),"wrongPassword123");

        utility.clickOnElement(By.id("loginBtn"));

        String errorMessage = utility.getElementText(By.className("error"));
        System.out.println(errorMessage);

        driver.quit();


    }
}
