package review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthPopUps {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


    }
}
