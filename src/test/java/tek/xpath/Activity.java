package tek.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(3000);


        driver.findElement(By.xpath("//p[text()='Video Games']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//p[text()='PlayStation 5 Console']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class='product__btn']")).click();
        Thread.sleep(3000);


    }
}
