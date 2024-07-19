package tek.review.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Activity1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#signinLink")))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='email']")))
                .sendKeys("crystal.a512@gmail.com");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='password']")))
                .sendKeys("CC234cc!");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".login__submit")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("accountLink")))
                .click();

        WebElement phoneElement = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.name("phoneNumber")));

        phoneElement.clear();
        String number = getRandomPhoneNumber();
        System.out.println("random number " + number);
        phoneElement.sendKeys(number);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("personalUpdateBtn")))
                .click();

        boolean isToastDisplayed = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.className("Toastify"))).isDisplayed();

        String toastText = wait.until(ExpectedConditions
                        .visibilityOfElementLocated(
                                By.cssSelector(".Toastify div.Toastify__toast-body > div:last-child")))
                .getText();
        System.out.println(toastText);
        if (isToastDisplayed)
            System.out.println("Test Passed Toast Displayed");
        else
            System.out.println("Test Failed");

        driver.quit();
    }

    private static String getRandomPhoneNumber() {
        Random random = new Random();

        // Generate 10 random digits and concatenate them to form a 10-digit number
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {

            // Generate a random digit between 0 and 9
            int digit = random.nextInt(10);
            sb.append(digit);
        }

        // Convert StringBuilder to String
        return sb.toString();
    }


    }
}
