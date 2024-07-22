package tek.uilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectingFromDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        //locate select element in web page
        //then find it using driver
        WebElement element = driver.findElement(By.id("programmingLanguageSelect"));

        Select programmingSelect = new Select(element);

        programmingSelect.selectByIndex(2);
        programmingSelect.selectByValue("cPlusPlus");
        programmingSelect.selectByVisibleText("C#");


    }

}
