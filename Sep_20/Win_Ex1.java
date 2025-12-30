package Sep_20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

import java.util.Iterator;
import java.util.Set;

public class Win_Ex1 {
    public static void main(String[] args) {    //throws InterruptedException {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
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

        //close the child window as driver is already points to it
        driver.close();

        //Thread.sleep(2000);

        //we have to explicitly switch back to parent window
        driver.switchTo().window(parentId);

        //perform operations of Parent window
        //after performing all operations, close it
        driver.close();

        System.out.println("** Program Ends **");
    }
}
