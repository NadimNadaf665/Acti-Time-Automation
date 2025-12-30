package Sep_7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility2;

import java.time.Duration;

public class AlertsEx1 {

    public static void main(String[] args) {    //throws InterruptedException {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/alerts");

        driver.findElement(By.id("promtButton")).click();

        //switch your driver from browser to alert:
        Alert alt = driver.switchTo().alert();

        String actAlertText = alt.getText();
        //verify actual with expected alert text
        System.out.println("Alert Text : " + actAlertText);

        //if text field is present on alert then enter text in alert's text field:
        alt.sendKeys("Suraj's automation sessions.");

        //Thread.sleep(Duration.ofSeconds(5));
        //click on Ok button
        alt.accept();

        //OR: click on Cancel button
        //alt.dismiss();

        System.out.println("** Program Ends **");
    }
}
