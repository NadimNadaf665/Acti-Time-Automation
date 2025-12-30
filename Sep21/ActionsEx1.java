
package java.Sep21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.GenericUtility1;

public class ActionsEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility1 gu = new GenericUtility1();
        WebDriver driver = gu.startUp("ch", "http://desktop-26ua208:81/login.do");

        WebElement userNameEle = driver.findElement(By.id("username"));
        Actions act = new Actions(driver);
        act.sendKeys(userNameEle, "admin").perform();

        WebElement pwdEle = driver.findElement(By.cssSelector(".textField.pwdfield"));
        act.sendKeys(pwdEle, "admin123").perform();

        WebElement loginBtnEle = driver.findElement(By.cssSelector("#loginButton>div"));
//        act.click(loginBtnEle).perform();
        //OR
        act.sendKeys(loginBtnEle, Keys.ENTER).perform();

        System.out.println("** Program Ends **");
    }
}
