
package java.Aug_29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetText_List {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        GenericUtility2 gu = new GenericUtility2();
        WebDriver driver = gu.startUp("ch", "http://desktop-26ua208:81/login.do");

        /*By userNameByObj = By.xpath("//input[@id='username']");
        WebElement userNameEle = driver.findElement(userNameByObj);
        userNameEle.sendKeys("admin");

        By pwdByObj = By.cssSelector(".textField.pwdfield");
        WebElement passwordEle = driver.findElement(pwdByObj);
        passwordEle.sendKeys("manager");

        By loginBtnByObj = By.cssSelector("#loginButton>div");
        WebElement loginBtnEle = driver.findElement(loginBtnByObj);
        loginBtnEle.click();*/

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("admin123");
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        //capture all Tab name elements
        List<WebElement> tabNamesList = driver.findElements(By.cssSelector("#topnav .label"));

        List<String> actNames = new ArrayList<String>();    //declared
        //get the Text of each tab WebElement
        for( int  i = 0;  i < tabNamesList.size();  i ++) {
            WebElement  ele = tabNamesList.get( i );
            String str = ele.getText();
            //System.out.println( str );
            actNames.add(str);
        }
        System.out.println("********* OR by using for each loop ***********");
        for(WebElement  ele  : tabNamesList ) {
            String str = ele.getText();
            System.out.println( str );
        }
        System.out.println("");
        String[] expTabNames = { "TIME-TRACK", "TASKS", "REPORTS", "USERS" };
        //verify actual and expected tab names
        //list and array:
        List<String> expTabNamesList = Arrays.asList(expTabNames);      //static list
        //OR
        List<String> targetList = new ArrayList<String>(Arrays.asList(expTabNames));    //dynamic list
        //Now exp and act both are list, simply compare it.
        //Compare logic:


        System.out.println("** Program Ends **");
    }
}