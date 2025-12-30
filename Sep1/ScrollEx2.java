package Sep1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class ScrollEx2 {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/automation-practice-form");

//        WebElement ele = driver.findElement(By.xpath("//html"));
//        ele.sendKeys(Keys.PAGE_DOWN);

        WebElement submitBtn = driver.findElement(By.id("submit"));

        // by using Javascript:
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",submitBtn);

        System.out.println("** Program Ends **");
    }
}
