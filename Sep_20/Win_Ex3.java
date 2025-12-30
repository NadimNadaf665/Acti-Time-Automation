package Sep_20;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.util.Iterator;
import java.util.Set;

public class Win_Ex3 {
    public static void main(String[] args) {    //throws InterruptedException {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
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
            try {
                WebElement ele = driver.findElement(By.tagName("h1"));
                String txt = ele.getText();
                System.out.println("Child Win Ele TXT : " + txt);
                break;
            } catch(Exception e) {
                driver.close();     //closes the child window which is not required.
            }
        }
        //if there is no step to perform operation on any other window then close all
        driver.quit();

        System.out.println("** Program Ends **");
    }
}
