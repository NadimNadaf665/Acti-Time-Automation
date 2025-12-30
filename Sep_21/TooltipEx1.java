package Sep_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.GenericUtility;

public class TooltipEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/tool-tips");

        WebElement btn = driver.findElement(By.id("toolTipButton"));

        Actions act = new Actions(driver);
        act.moveToElement(btn).perform();           //this will move mouse pointer on WebElement

        WebElement tooltipEle = driver.findElement(By.cssSelector(".tooltip-inner"));
        String tooltipText = tooltipEle.getText();
        System.out.println("Tooltip TEXT : " + tooltipText);
        System.out.println("** Program Ends **");
    }
}