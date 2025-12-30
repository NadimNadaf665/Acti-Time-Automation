package Sep_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility2;

public class With_Select_Single_Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/select-menu");

        //1, identify the dropdown element
        WebElement ddl = driver.findElement(By.id("oldSelectMenu"));

        //create Select class object:
        Select sel = new Select(ddl);

        //get the selected option from the dropdown:
//        WebElement selectedOptionEle = sel.getFirstSelectedOption();
//
//        //get the text of that element:
//        String selectedColor = selectedOptionEle.getText();
        //OR
        String selectedColor = sel.getFirstSelectedOption().getText();

        //verify selected color is Red or not:
        String expDefaultSelectedColor = "Red";
        if(selectedColor.equals(expDefaultSelectedColor)) {
            System.out.println("Default selected color is 'Red'.");
        } else {
            System.out.println("Default selected color is not 'Red'.");
        }

        System.out.println("** Program Ends **");
    }
}
