package Sep_21;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.GenericUtility;

public class ActionsEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");

        WebElement userNameEle = driver.findElement(By.id("username"));
        Actions act = new Actions(driver);
        act.sendKeys(userNameEle, "admin").perform();

        WebElement pwdEle = driver.findElement(By.cssSelector(".textField.pwdfield"));
        act.sendKeys(pwdEle, "manager").perform();

        WebElement loginBtnEle = driver.findElement(By.cssSelector("#loginButton>div"));
//        act.click(loginBtnEle).perform();
        //OR
        act.sendKeys(loginBtnEle, Keys.ENTER).perform();

        System.out.println("** Program Ends **");
    }
}
