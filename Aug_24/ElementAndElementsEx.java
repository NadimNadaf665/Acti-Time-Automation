
package java.Aug_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility2;

import java.util.List;

public class ElementAndElementsEx {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");

        //findElement gives exception if unable to find the WebElement
        //WebElement userNameEle = driver.findElement(By.xpath("//input[@id='username123']"));

        //findElements
        List<WebElement> allEles = driver.findElements(By.cssSelector("td[valign='middle123']>input[type]"));
        System.out.println("size: " + allEles.size());
        System.out.println("isEmpty: " + allEles.isEmpty());

        System.out.println("** Program Ends **");
    }
}
