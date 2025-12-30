package Sep_7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility2;

public class WO_Select_Single_Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/select-menu");

        driver.findElement(By.cssSelector("#withOptGroup .css-1hwfws3")).click();

        driver.findElement(By.xpath("//div[text()='Group 2, option 2']")).click();

        System.out.println("** Program Ends **");
    }
}
