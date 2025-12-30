package java.Aug_24;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetSizeMethodEx {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().setSize(new Dimension(500, 550));
        String url = "https://www.cognizant.com/in/en";
        driver.get(url);
        System.out.println("** Program Ends **");
    }
}
