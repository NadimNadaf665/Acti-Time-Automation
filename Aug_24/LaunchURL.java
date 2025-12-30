package java.Aug_24;


import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility1;

public class LaunchURL {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility1 gu = new GenericUtility1();
        WebDriver driver = gu.openBrowser("ch");

        driver.get("https://www.google.com");

        System.out.println("** Program Ends **");
    }
}
