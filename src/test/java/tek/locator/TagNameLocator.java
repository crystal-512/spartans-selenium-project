package tek.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class TagNameLocator {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        By anchorsTagLocator = By.tagName("a");

        //method findElements return List<WebElement> contains all the elements find
        //with By strategy
        List<WebElement> anchorElements = driver.findElements(anchorsTagLocator);

        System.out.println(anchorElements.size());

      //  for (WebElement element : anchorElements) {
      //      System.out.println(element.getText());

     //   }

        //find how many image is in BBC
      //  By imageTag = By.tagName("img");
      //  List<WebElement> imageElements = driver.findElements(imageTag);
      //  System.out.println(imageElements.size());

        By buttonsTag = By.tagName("button");
        List<WebElement> buttonsElements = driver.findElements(buttonsTag);
        System.out.println(buttonsElements.size());

        for (WebElement element : buttonsElements) {
            System.out.println(element.getText());
        }


        driver.quit();
    }



}
