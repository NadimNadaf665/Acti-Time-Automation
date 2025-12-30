package java.Aug_23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex3 {
    public static void main(String[] args) {
        String browserName = "chrome";
        Ex3 obj = new Ex3();
        obj.openBrowser(browserName);
    }

    /*public WebDriver openBrowser(String browserName) {
        WebDriver obj = null;
        if(browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("ch")) {
            obj = new ChromeDriver();

        } else if(browserName.equalsIgnoreCase("edge")) {
            obj = new EdgeDriver();

        } else if(browserName.equalsIgnoreCase("firefox") || browserName.equalsIgnoreCase("ff")) {
            obj = new FirefoxDriver();

        } else {
            System.out.println("Invalid browser name!!!");
        }
        return obj;
    }*/

    public WebDriver openBrowser(String browserName) {
        WebDriver driver = null;
        if(browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("ch")) {
            driver = new ChromeDriver();

        } else if(browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();

        } else if(browserName.equalsIgnoreCase("firefox") || browserName.equalsIgnoreCase("ff")) {
            driver = new FirefoxDriver();

        } else {
            System.out.println("Invalid browser name!!!");
        }
        return driver;
    }
}
