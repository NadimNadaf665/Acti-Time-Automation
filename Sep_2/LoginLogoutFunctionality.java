package Sep_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility2;

import java.time.Duration;

public class LoginLogoutFunctionality {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");
        //implicit wait:
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        WebElement logoutEle = driver.findElement(By.id("logoutLink"));
        logoutEle.click();

        System.out.println("** Program Ends **");
    }
}
