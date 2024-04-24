package SeleniumLocators;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorsByXpath3 extends BaseTestNew {

    @Test
    public void byID() throws InterruptedException {
        driver.get("https://www.moneycontrol.com/commodity/");

        // gold,asdfasdf,,adsfasdf

       String x =  driver.findElement(By.xpath("//table[@class='curDerivatives_web_commontable__NT0j9']/tbody/tr/td/h4[contains(text(),'SILVER')]//following::td[1]")).getText();

       System.out.println("Silver: "+ x);
    }
}
