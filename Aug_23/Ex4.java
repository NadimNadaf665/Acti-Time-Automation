package java.Aug_23;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility1;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility1 gu = new GenericUtility1();
        WebDriver driver = gu.openBrowser("ch");
        //perform next operations on browser by using 'driver'

        //can we minimize the browser:
        //we can minimize the browser from selenium 4.0.0 onwards:
        //driver.manage().window().minimize();

        //write code to maximize the browser:
        //driver.manage().window().maximize();
        //any alternative to maximize it:  ***Options
        System.out.println("** Program Ends **");
    }
}
