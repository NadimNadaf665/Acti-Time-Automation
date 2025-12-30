package Sep_7;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility2;

public class WO_Select_Single_Ex2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/select-menu");

        driver.findElement(By.cssSelector("#withOptGroup .css-1hwfws3")).click();

        WebElement inputField = driver.findElement(By.cssSelector("#withOptGroup .css-1hwfws3 input"));
        inputField.sendKeys("Group 2, option 2");

        WebElement searchedEle = driver.findElement(By.xpath("//div[text()='Group 2, option 2']"));
        //searchedEle.click();
        //gu.clickByJS(driver, searchedEle);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);

        System.out.println("** Program Ends **");
    }
}
