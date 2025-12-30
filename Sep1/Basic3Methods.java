package Sep1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility;

public class Basic3Methods {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/radio-button");

        WebElement yesRdoLabel = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        System.out.println("isDisplayed: "+ yesRdoLabel.isDisplayed());     //true

        WebElement yesRdoBtn = driver.findElement(By.id("yesRadio"));
        System.out.println("isSelected: " + yesRdoBtn.isSelected());     //false

        //yesRdoBtn.click();
        gu.clickByJS(driver, yesRdoBtn);
        System.out.println("After click on Yes Radio");
        System.out.println("isSelected: " + yesRdoBtn.isSelected());     //true

        WebElement noRdoBtn = driver.findElement(By.id("noRadio"));
        System.out.println("isEnabled: " + noRdoBtn.isEnabled());     //false

        System.out.println("** Program Ends **");
    }
}
