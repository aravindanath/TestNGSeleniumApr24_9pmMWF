package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NestedFrameHandlign extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");

      String text =   driver.findElement(By.id("content")).getText();

      System.out.println("text: " + text);

      driver.switchTo().parentFrame();
      driver.switchTo().frame("frame-bottom");

     String msg =  driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();

 
     System.out.println("msg: " + msg);




    }
}
