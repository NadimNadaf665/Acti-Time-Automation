package Sep1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClickExUsingJavascript {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");

        WebElement loginBtn = driver.findElement(By.cssSelector("#loginButton>div"));
        //loginBtn.click();
        //suppose, WebElement's click method won't work: either gives exception or no exception

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", loginBtn);

        System.out.println("** Program Ends **");
    }
}
