
package java.Aug_28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility2;

public class GetTextEx {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "http://desktop-26ua208:81/login.do");

        By headerByObj = By.id("headerContainer");

        WebElement headerEle = driver.findElement(headerByObj);

        String actText = headerEle.getText();
        System.out.println("actText : " + actText);

        //assignment: verify above text with expText = "Please identify yourself";

        System.out.println("** Program Ends **");
    }
}