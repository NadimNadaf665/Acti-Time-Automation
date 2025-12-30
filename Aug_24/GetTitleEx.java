package java.Aug_24;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility2;

public class GetTitleEx {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "http://desktop-26ua208:81/login.do");

        String expTitle = "";
        String actualTitle =  driver.getTitle();
        System.out.println("Actual URL : " + actualTitle);

        if(expTitle.equals(actualTitle)) {
            System.out.println("Login page Title is displayed as expected.");
        } else {
            System.out.println("Login page Title is not displayed as expected.");
        }

        System.out.println("** Program Ends **");
    }
}
