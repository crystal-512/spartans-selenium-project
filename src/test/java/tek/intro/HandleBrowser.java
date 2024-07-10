package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {

    public static void main(String[] args) {

        //Open Chrome Browser
        ChromeDriver chromeDriver = new ChromeDriver();

        //Use this method to maximize web browser
        chromeDriver.manage().window().maximize();

        //navigate to a URL
        chromeDriver.get("https://google.com");

        String title = chromeDriver.getTitle();
         System.out.println(title);

        //to close browser entirely
        chromeDriver.quit();
    }
}
