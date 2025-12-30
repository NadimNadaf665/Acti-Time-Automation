package Sep12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility2;

import java.util.Iterator;
import java.util.Set;

public class Win_Ex2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/browser-windows");

        //get parent window id:
        String parentId1 = driver.getWindowHandle();

        driver.findElement(By.id("tabButton")).click();

        //get parent window id, as driver is still pointing to the Parent Window only:
        String parentId2 = driver.getWindowHandle();
        System.out.println("ParentId1 : " + parentId1);
        //System.out.println("ParentId2 : " + parentId2);

        //get all window ids which are opened by current WebDriver driver:
        Set<String> allWinIds = driver.getWindowHandles();
        //System.out.println("All Window Ids: " + allWinIds);

        //Iterate Set:
        Iterator<String> itr = allWinIds.iterator();

        //Traverse 1 by 1:
        String id = itr.next();
        //

        System.out.println("** Program Ends **");
    }
}
