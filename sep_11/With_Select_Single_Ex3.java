package sep_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class With_Select_Single_Ex3 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/select-menu");

        //1, identify the dropdown element
        WebElement ddl = driver.findElement(By.id("oldSelectMenu"));

        //create Select class object:
        Select sel = new Select(ddl);

        //select 'Aqua' color:
        //way 1: byVisibleText:
        sel.selectByVisibleText("Aqua");

        //way 2: selectByValue
//        sel.selectByValue("10");        //attribute value of 'value' attribute name

        //way 3: selectByIndex
//        sel.selectByIndex(10);

        //verify the selected option:
        WebElement selectedOption = sel.getFirstSelectedOption();
        String selectedColor = selectedOption.getText();
        //if-else:              //assertions
        System.out.println("selected color : " + selectedColor);

        System.out.println("** Program Ends **");
    }
}
