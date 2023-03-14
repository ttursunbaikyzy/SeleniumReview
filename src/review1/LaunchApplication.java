package review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchApplication {
    public static void main(String[] args) {
        //1. Open the Browser
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\tamik\\IdeaProjects\\SeleniumReview\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://google.com/");
        String pathTitle=driver.getTitle();
        System.out.println(pathTitle);


    }
}
