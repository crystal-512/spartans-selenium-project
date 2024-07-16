package tek.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://google.com/");

        driver.findElement(By.className("gLFyf")).sendKeys("Tek School");

        driver.findElement(By.className("gNO89b")).click();

        driver.findElement(By.partialLinkText("TEK SCHOOL")).click();

        driver.quit();


    }
}
