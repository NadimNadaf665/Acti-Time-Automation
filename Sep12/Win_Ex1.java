
package Sep12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Win_Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");

        // Launch browser directly (no GenericUtility)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // Get parent window id:
        String parentId1 = driver.getWindowHandle();

        // Click on the button to open a new tab
        driver.findElement(By.id("tabButton")).click();

        // Parent ID remains the same
        String parentId2 = driver.getWindowHandle();
        System.out.println("ParentId1 : " + parentId1);
        // System.out.println("ParentId2 : " + parentId2);

        // Get all window ids opened by WebDriver
        Set<String> allWinIds = driver.getWindowHandles();
        // System.out.println("All Window Ids: " + allWinIds);

        // Iterate over the set of window ids
        Iterator<String> itr = allWinIds.iterator();

        while (itr.hasNext()) {
            String id = itr.next();
            if (!id.equals(parentId1)) {
                // Switch to child window
                driver.switchTo().window(id);
                System.out.println("Child window title: " + driver.getTitle());
                driver.close(); // Close child window
            }
        }

        // Switch back to parent window
        driver.switchTo().window(parentId1);
        System.out.println("Parent window title: " + driver.getTitle());

        driver.quit();
        System.out.println("** Program Ends **");
    }
}
