package Sep_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.GenericUtility2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class With_Select_Single_Ex2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "https://demoqa.com/select-menu");

        //1, identify the dropdown element
        WebElement ddl = driver.findElement(By.id("oldSelectMenu"));

        //create Select class object:
        Select sel = new Select(ddl);

        //verify 11 colors should be present in dropdown
        List<WebElement> allOptions = sel.getOptions();
        int numOfColors = allOptions.size();
        //verify code:....

        //*************************************************
        String[] expColorsAr = {"Red","Blue","Green","Yellow","Purple",
                "Black","White","Voilet","Indigo","Magenta","Aqua"};

        List<String> ActAllText = new ArrayList<>();
        //for(int i=0; i<allOptions.size(); i++) {
        for(WebElement ele: allOptions) {
            String txt = ele.getText();
            ActAllText.add(txt);
        }
        System.out.println("All Text: " + ActAllText);

        //verify ActAllText with expColorsAr:
        //-> first both should be in same format
        List<String> expColors = Arrays.asList(expColorsAr);
        //compare both list objects:
        //

        System.out.println("** Program Ends **");
    }
}
