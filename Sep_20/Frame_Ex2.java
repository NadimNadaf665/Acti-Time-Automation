package Sep_20;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.GenericUtility;

import java.time.Duration;

public class Frame_Ex2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/nestedframes");

        //inspect the WebElement and check its ONLY parent tags for <iframe> html tag

        //identify the iframe html tag as WebElement and switch to the frame:
        WebElement frameEle = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frameEle);

        //one more child iframe is present:
        //FIRST switch to outer iframe then only identify the child iframe:
        //identify the iframe html tag as WebElement and switch to the frame:
        WebElement frameEle2 = driver.findElement(By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(frameEle2);

        WebElement ele = driver.findElement(By.tagName("p"));
        String txt = ele.getText();
        System.out.println(txt);

        System.out.println("** Program Ends **");
    }
    public void waitFroFrameAndSwitchBtIdOrName(WebDriver driver, int time, String frameIdOrName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));
    }
    //write remaining explicit wait methods of Frames.
    //Total 4 methods
}
