package SeleniumLocators;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LocatorsByID  extends BaseTestNew {

    @Test
    public void byID(){
        driver.get("https://www.amazon.in");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15", Keys.ENTER);
    }
}
