package sep_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility;

import java.util.List;

public class With_Select_Multi_Ex2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/select-menu");

        //1, identify the dropdown element
        WebElement ddl = driver.findElement(By.id("cars"));

        gu.scrollByJS(driver, ddl);

        //create Select class object:
        Select sel = new Select(ddl);

        //verify number of cars:
        List<WebElement> allOptions = sel.getOptions();
        int totalCars = allOptions.size();
        System.out.println("Total cars in dropdown: " + totalCars);

        //select Audi, Volvo, Opel in dropdwon:
        sel.selectByVisibleText("Audi");
        sel.selectByVisibleText("Volvo");
        sel.selectByVisibleText("Opel");
//        sel.selectByValue("volvo");
//        sel.selectByIndex(2);
        //**************** if you want to select multiple cars *************
        //First create List<String> OR create array of String then:
//        String[] ar = {"","",...};   //OR
//        List<String> ar = ...
//        for(String str: ar) {
//            sel.selectByVisibleText( str );
//        }

        //verify selected cars:
        List<WebElement> selectedOptions = sel.getAllSelectedOptions();
        int selectedCount = selectedOptions.size();
        System.out.println("selected cars count:" + selectedCount);

        List<String> selectedCars = gu.getTextFromList(selectedOptions);
        System.out.println("Selected Cars: " + selectedCars);

        System.out.println("** Program Ends **");
    }
}
