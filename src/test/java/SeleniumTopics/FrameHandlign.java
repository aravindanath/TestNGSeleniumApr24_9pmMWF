package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameHandlign extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
   //     Thread.sleep(2000);
      WebElement element =  driver.findElement(By.id("tinymce"));
      element.clear();
     //   Thread.sleep(2000);
      element.sendKeys("Hello World!");


    }
}
