package Sep_2;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.GenericUtility2;

    public class BrowserMethodsEx {

        public static void main(String[] args) {
            System.out.println("** Program Starts **");
            GenericUtility2 gu = new GenericUtility2();
            WebDriver driver = gu.startUp("ch", "https://demoqa.com/webtables");

            driver.navigate().to("https://www.facebook.com");

            System.out.println("** Program Ends **");
        }
    }

