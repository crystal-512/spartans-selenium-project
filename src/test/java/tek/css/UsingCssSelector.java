package tek.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelector {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(3000);


        By titleLocator = By.cssSelector("div.home__categories-grid > div:nth-child(2) > h1");
        String text = driver.findElement(titleLocator).getText();

        System.out.println(text);

        driver.quit();
    }
}
