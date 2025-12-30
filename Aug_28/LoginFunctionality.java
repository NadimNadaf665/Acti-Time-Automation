
package Aug_28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility2;

public class LoginFunctionality {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "http://desktop-26ua208:81/login.do");

        By userNameByObj = By.xpath("//input[@id='username']");
        WebElement userNameEle = driver.findElement(userNameByObj);
        userNameEle.sendKeys("admin");

        By pwdByObj = By.cssSelector(".textField.pwdfield");
        WebElement passwordEle = driver.findElement(pwdByObj);
        passwordEle.sendKeys("admin123");

        By loginBtnByObj = By.cssSelector("#loginButton>div");
        WebElement loginBtnEle = driver.findElement(loginBtnByObj);
        loginBtnEle.click();

        By logoutByObj = By.id("logoutLink");
        WebElement logoutEle = driver.findElement(logoutByObj);
        logoutEle.click();

        System.out.println("** Program Ends **");
    }
}