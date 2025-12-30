package Sep_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.GenericUtility;

import java.time.Duration;

public class LoginLogoutFunctionality {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        //Explicit wait:
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));*/
        //OR
        /*By logoutByObj = By.id("logoutLink");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(logoutByObj)));*/
        //OR
//        gu.waitForVisibilityOfByType(driver, 50, "id", "logoutLink");
        //OR
//        gu.waitForVisibilityOfByType(driver, 50, "xpath", "//a[@id='logoutLink']");
        //OR
//        gu.waitForVisibilityOfByType(driver, 50, "css", "a[id='logoutLink']");
        //OR
//        gu.waitForVisibilityOfByType(driver, 50, "css", "#logoutLink");
        //OR
        /*By logoutByObj = By.id("logoutLink");
        gu.waitForVisibilityOfByObj(driver, 20, logoutByObj);*/

        //OR
        By logoutByObj = By.id("logoutLink");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutByObj));

        WebElement logoutEle = driver.findElement(By.id("logoutLink"));
        logoutEle.click();

        System.out.println("** Program Ends **");
    }
}
