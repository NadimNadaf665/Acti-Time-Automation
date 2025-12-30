
package java.Aug_24;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility2;

public class LaunchURL2 {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        String browserName = "ch";
        String url = "https://www.google.com";
        WebDriver driver = gu.startUp(browserName, url);

        System.out.println("** Program Ends **");
    }
}
