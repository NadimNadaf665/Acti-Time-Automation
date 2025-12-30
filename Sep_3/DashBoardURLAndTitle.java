package Sep_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.GenericUtility;

import java.time.Duration;

public class DashBoardURLAndTitle {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "http://localhost:93/login.do");

        //login
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        //verify dashboard page title
        String expTitle = "actiTIME - Enter Time-Track";
        //add explicit wait for expected title:
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
        //OR
        wait.until(ExpectedConditions.titleContains("Time-Track"));

        String actTitle = driver.getTitle();
        if(expTitle.equalsIgnoreCase(actTitle)) {
            System.out.println("Dashboard Title is as expected.");
        } else {
            System.out.println("Dashboard Title is NOT as expected.");
        }

        //verify dashboard page URL
        String expURL = "http://localhost:93/user/submit_tt.do";
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait2.until(ExpectedConditions.urlToBe("http://localhost:93/user/submit_tt.do"));
        //OR
        wait2.until(ExpectedConditions.urlContains("submit_tt"));

        String actURL = driver.getCurrentUrl();
        if(expURL.equalsIgnoreCase(actURL)) {
            System.out.println("Dashboard URL is as expected.");
        } else {
            System.out.println("Dashboard URL is NOT as expected.");
        }

        System.out.println("** Program Ends **");
    }
}
