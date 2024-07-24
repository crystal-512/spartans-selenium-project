package tek.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String currentWindowId = driver.getWindowHandle();

        driver.findElement(By.linkText("Test Selenium")).click();
        Thread.sleep(3000);

        Set<String> allTabs = driver.getWindowHandles();

        for(String tab : allTabs) {
            if(!tab.equals(currentWindowId)) {
                driver.switchTo().window(tab);
                break;
            }
        }

        Thread.sleep(3000);
        driver.findElement(By.linkText("Inputs")).click();

        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(currentWindowId);

        Thread.sleep(3000);
        driver.findElement(By.linkText("Sign in")).click();
    }
}
