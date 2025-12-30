package Sep_7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.GenericUtility2;

import java.time.Duration;

public class AlertsEx2 {

    public static void main(String[] args) {    //throws InterruptedException {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/alerts");

        driver.findElement(By.id("timerAlertButton")).click();

        //wait script for alert to be displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        //switch your driver from browser to alert:
        Alert alt = driver.switchTo().alert();

        String actAlertText = alt.getText();
        //verify actual with expected alert text
        System.out.println("Alert Text : " + actAlertText);

        //click on Ok button
        alt.accept();

        System.out.println("** Program Ends **");
    }
}
