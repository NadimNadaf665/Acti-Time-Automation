package sep_11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility;

import java.util.Arrays;
import java.util.List;

public class With_Select_Multi_Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/select-menu");

        //1, identify the dropdown element
        WebElement ddl = driver.findElement(By.id("cars"));

        gu.scrollByJS(driver, ddl);

        //create Select class object:
        Select sel = new Select(ddl);

        //verify no cars are selected:
        List<WebElement> selectedOptions = sel.getAllSelectedOptions();
        int selectedCount = selectedOptions.size();
        System.out.println("selected cars count:" + selectedCount);

        //verify number of cars:
        List<WebElement> allOptions = sel.getOptions();
        int totalCars = allOptions.size();
        System.out.println("Total cars in dropdown: " + totalCars);

        //verify all car names:
        String[] expCarAr = {"Volvo", "Saab", "Opel", "Audi"};
        List<String> expCarList = Arrays.asList();

        List<String> actCarsList = gu.getTextFromList(allOptions);

        //compare both list:
        /*if(expCarList.equals(actCarsList)) {
            System.out.println("All cars as expected.");
        } else {
            System.out.println("All cars are not as expected.");
        }*/

        System.out.println("** Program Ends **");
    }
}
