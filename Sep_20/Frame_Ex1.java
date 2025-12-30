package Sep_20;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class Frame_Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/frames");

        //inspect the WebElement and check its ONLY parent tags for <iframe> html tag

//        //WAY 1: by using Frame Element
//        //identify the iframe html tag as WebElement:
//        WebElement frameEle = driver.findElement(By.id("frame1"));
//
//        //switch to the frame:
//        driver.switchTo().frame(frameEle);

        //WAY 2: if iframe tag has unique IDValue/unique Name value
        driver.switchTo().frame("frame1");

        WebElement ele = driver.findElement(By.id("sampleHeading"));
        String txt = ele.getText();
        System.out.println(txt);

        System.out.println("** Program Ends **");
    }
}
