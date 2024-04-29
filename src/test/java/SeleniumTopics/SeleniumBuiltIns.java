package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumBuiltIns extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://www.google.com");

       WebElement textarea =  driver.findElement(By.name("q"));
       if(textarea.isEnabled()) {
           textarea.sendKeys("Automation Jobs in Bangalore");
           textarea.clear();
           textarea.sendKeys("Mobile Automation Jobs in Bangalore", Keys.ENTER);
       }else{
           System.out.println("Textarea is not displayed ");
       }
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
    }


}
