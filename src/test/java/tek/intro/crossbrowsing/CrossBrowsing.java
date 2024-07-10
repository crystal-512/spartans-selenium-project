package tek.intro.crossbrowsing;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CrossBrowsing {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();


        driver.manage().window().maximize();
        driver.get("https://google.com");


    }
}
