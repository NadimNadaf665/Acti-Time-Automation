package Sep1;

import org.openqa.selenium.*;
import org.utilities.GenericUtility;

public class ActiveEleEx {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");

        WebElement ele = driver.switchTo().activeElement();
        ele.sendKeys("admin");

        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("manager");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        //driver.switchTo().activeElement().click();
        //OR
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);

        System.out.println("** Program Ends **");
    }
}
