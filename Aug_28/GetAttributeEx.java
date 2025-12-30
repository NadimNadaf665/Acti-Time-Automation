
package java.Aug_28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility2;

public class GetAttributeEx {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "http://desktop-26ua208:81/login.do");

        By headerByObj = By.id("headerContainer");

        WebElement headerEle = driver.findElement(headerByObj);

        String attribValue = headerEle.getAttribute("class");       //old method
        System.out.println("attribValue : " + attribValue);

        String attribValue2 = headerEle.getDomAttribute("class");
        System.out.println("attribValue2 : " + attribValue2);

        System.out.println("** Program Ends **");
    }
}