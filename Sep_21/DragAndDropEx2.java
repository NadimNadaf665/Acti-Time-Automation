package Sep_21;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.GenericUtility;

public class DragAndDropEx2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/droppable");

        WebElement src = driver.findElement(By.id("draggable"));
        WebElement des = driver.findElement(By.cssSelector("#simpleDropContainer>#droppable"));

        Actions act = new Actions(driver);
        //suppose dragAndDrop and dragAndDropBy both methods are not working on your application:

        act.moveToElement(src).clickAndHold(src).moveToElement(des).release().build().perform();

        System.out.println("** Program Ends **");
    }
}
