package SeleniumLocators;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LocatorsByLinkText extends BaseTestNew {

    @Test
    public void byID() throws InterruptedException {
        driver.get("https://www.google.com");

       driver.findElement(By.linkText("Images")).click();

       Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);


    }
}
