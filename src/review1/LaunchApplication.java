package review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args) {
        //1. Open the Browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tamik\\IdeaProjects\\SeleniumReview\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();


    }
}
