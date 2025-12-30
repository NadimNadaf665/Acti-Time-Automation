package Sep12;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {
    public static void main(String[] args) {
        String browserName = "chrome";
        Ex2 obj = new Ex2();
        obj.openBrowser(browserName);
    }

    public void openBrowser(String browserName) {
        if(browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("ch")) {
            ChromeDriver objCh = new ChromeDriver();

        } else if(browserName.equalsIgnoreCase("edge")) {
            EdgeDriver objEdge = new EdgeDriver();

        } else if(browserName.equalsIgnoreCase("firefox") || browserName.equalsIgnoreCase("ff")) {
            FirefoxDriver objFF = new FirefoxDriver();

        } else {
            System.out.println("Invalid browser name!!!");
        }
    }
}
