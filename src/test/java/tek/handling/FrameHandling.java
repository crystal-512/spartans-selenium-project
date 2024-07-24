package tek.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FrameHandling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.switchTo().frame(0);
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
                driver.switchTo().frame(frameElement);

        String insideFrame = driver.findElement(By.xpath("//h1[contains(text(), 'This page')]"))
                .getText();

        System.out.println(insideFrame);

        driver.switchTo().defaultContent();

        String outsideFrame = driver.findElement(By.id("title"))
                .getText();

        System.out.println(outsideFrame);

    }
}
