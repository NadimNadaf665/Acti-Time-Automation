package Sep_7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.GenericUtility2;

import java.time.Duration;

public class AlertsEx3 {

    public static void main(String[] args) {    //throws InterruptedException {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/alerts");

        driver.findElement(By.id("timerAlertButton")).click();

        //wait script for alert to be displayed
        if(gu.isAlertPresent(driver, 10)) {
            System.out.println("User is not logged in.");
            Alert alt = driver.switchTo().alert();
            String actAlertText = alt.getText();
            //verify actual with expected alert text
            System.out.println("Alert Text : " + actAlertText);
            //click on Ok button
            alt.accept();
            //user login code
        } else {
            System.out.println("User is already logged in...");     //as example
        }

        System.out.println("** Program Ends **");
    }
}
