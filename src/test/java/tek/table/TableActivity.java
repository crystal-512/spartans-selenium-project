package tek.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TableActivity {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/csr/plans");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.linkText("Login"));

        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

        driver.findElement(By.linkText("Plans")).click();

        List<WebElement> priceElements = driver.findElements(By.cssSelector("th[text()='Plan Base Price'] > td:nth-child(2)"));
        System.out.println(priceElements.size());

        for (WebElement element : priceElements) {
            System.out.println(element.getText());
        }

        driver.quit();


    }
}
