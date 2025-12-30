package Sep12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.GenericUtility2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Win_Ex4 {
    public static void main(String[] args) {    //throws InterruptedException {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/browser-windows");

        //get parent window id:
        String parentId = driver.getWindowHandle();
        driver.findElement(By.id("windowButton")).click();

        //get all window ids which are opened by current WebDriver driver:
        Set<String> allWinIds = driver.getWindowHandles();

        //First remove the parent win id from Set<String>
        allWinIds.remove(parentId);
        Iterator<String> itr = allWinIds.iterator();

        while(itr.hasNext()) {
            String winId = itr.next();
            driver.switchTo().window(winId);        //switched to child window
            //perform operation of child window

            List<WebElement> allEles = driver.findElements(By.tagName("h1"));
            if( ! allEles.isEmpty() ) {
                String txt = allEles.get(0).getText();
                System.out.println("Child Win Ele TXT : " + txt);
                break;
            } else {
                driver.close();     //close the child window which is not required
            }
        }
        //if there is no step to perform operation on any other window then close all
        driver.quit();

        System.out.println("** Program Ends **");
    }

    public void waitForNumberOfWindows(WebDriver driver, int time, int numOfWindows) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.numberOfWindowsToBe(numOfWindows));
    }
}
