package Sep_21;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.GenericUtility;

public class DragAndDropEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/droppable");

        WebElement src = driver.findElement(By.id("draggable"));
        //WebElement des = driver.findElement(By.cssSelector("#simpleDropContainer>#droppable"));

        Actions act = new Actions(driver);
        //act.dragAndDrop(src, des).perform();

        //suppose destination Element is not present:
        act.dragAndDropBy(src, 290, 50).perform();
        System.out.println("** Program Ends **");
    }
}
