package java.Sep_20;

import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility2;

import java.util.Iterator;
import java.util.Set;

public class Win_Ex2 {
    public static void main(String[] args) {    //throws InterruptedException {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/browser-windows");

        //get parent window id:
        String parentId = driver.getWindowHandle();
        driver.findElement(By.id("tabButton")).click();

        //get all window ids which are opened by current WebDriver driver:
        Set<String> allWinIds = driver.getWindowHandles();
        //System.out.println("All Window Ids: " + allWinIds);
        // ----------------- WAY 1 -----------------
        /*//Iterate Set:
        Iterator<String> itr = allWinIds.iterator();
        //Traverse 1 by 1:
        String winId = itr.next();

        if( winId.equals(parentId1)) {
            winId = itr.next();
        }*/
        // ----------------- WAY 2 -----------------
        //First remove the parent win id from Set<String>
        allWinIds.remove(parentId);
        Iterator<String> itr = allWinIds.iterator();

        String childWinId = itr.next();

        //switch on Child Window:
        driver.switchTo().window(childWinId);

        WebElement childWinEle = driver.findElement(By.tagName("h1"));
        String txt = childWinEle.getText();
        System.out.println(txt);

        //once you perform operations on child window,
        //and no more steps present in your test case about the parent window.

        driver.quit();

        System.out.println("** Program Ends **");
    }
}

