package SeleniumLocators;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsByXpath4 extends BaseTestNew {

    @Test
    public void byID() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/tables");

        // gold,asdfasdf,,adsfasdf

       String x =  driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'Tim')]//preceding-sibling::td")).getText();

       System.out.println("Last Name: "+ x);
    }
}
