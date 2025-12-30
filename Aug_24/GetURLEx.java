
package java.Aug_24;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility2;

public class GetURLEx {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");

        String expURL = "http://localhost:93/login.do";
        String actualURL = driver.getCurrentUrl();
        System.out.println("Actual URL : " + actualURL);

        if(expURL.equals(actualURL)) {
            System.out.println("Login page URL is displayed as expected.");
        } else {
            System.out.println("Login page URL is not displayed as expected.");
        }

        System.out.println("** Program Ends **");
    }
}
