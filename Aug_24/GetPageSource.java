package java.Aug_24;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility2;

public class GetPageSource {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");

        String currentDOM = driver.getPageSource();
        System.out.println("currentDOM: " + currentDOM);

        System.out.println("** Program Ends **");
    }
}
