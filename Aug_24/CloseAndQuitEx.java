
package java.Aug_24;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility2;

public class CloseAndQuitEx {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "http://desktop-26ua208:81/login.do");

        //driver.close();
        driver.quit();
        System.out.println("** Program Ends **");
    }
}