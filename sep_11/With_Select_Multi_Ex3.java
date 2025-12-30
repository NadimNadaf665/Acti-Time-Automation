package sep_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility;

import java.util.List;

public class With_Select_Multi_Ex3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/select-menu");

        //1, identify the dropdown element
        WebElement ddl = driver.findElement(By.id("cars"));
        gu.scrollByJS(driver, ddl);

        //create Select class object:
        Select sel = new Select(ddl);

        //select all the data from dropdown:
        // we don't  have direct method to select the all data from dropdown:
        int allData = sel.getOptions().size();
        for(int i=0; i<allData; i++) {
            sel.selectByIndex(i);
        }
        Thread.sleep(5000);

//        sel.deselectAll();
        //OR
        sel.deselectByVisibleText("Saab");
        sel.deselectByValue("opel");
        sel.deselectByIndex(0);

        System.out.println("** Program Ends **");
    }
}
