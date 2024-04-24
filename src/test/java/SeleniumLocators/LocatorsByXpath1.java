package SeleniumLocators;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorsByXpath1 extends BaseTestNew {

    @Test
    public void byID() throws InterruptedException {
        driver.get("https://www.indusind.com/in/en/personal.html#");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='close'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@id='myTab']/li/a[text()='PIONEER']")).click();
    }
}
