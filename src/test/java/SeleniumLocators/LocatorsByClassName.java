package SeleniumLocators;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LocatorsByClassName extends BaseTestNew {

    @Test
    public void byID(){
        driver.get("https://www.google.com");

       driver.findElement(By.className("gLFyf")).sendKeys("Automation Jobs",Keys.ENTER);
    }
}
