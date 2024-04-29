package SeleniumLocators;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LocatorsByCssClass extends BaseTestNew {

    @Test
    public void byID(){
        driver.get("https://www.google.com");

       driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Automation Jobs",Keys.ENTER);
    }
}
