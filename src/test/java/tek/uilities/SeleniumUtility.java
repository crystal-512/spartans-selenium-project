package tek.uilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility {

    private WebDriver driver;
    private WebDriverWait wait;

    public SeleniumUtility(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickOnElement(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendTextToElement(By locator, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(locator))
                .sendKeys(text);
    }
    public String getElementText(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getText();
    }
}
