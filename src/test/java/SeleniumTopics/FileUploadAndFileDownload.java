package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadAndFileDownload extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);
         driver.findElement(By.id("file-upload")).sendKeys("/Users/aravindanathdm/Documents/Automation_Classes/TestNGSeleniumApr24/src/test/java/SeleniumLocators/topics");

         Thread.sleep(2000);

         driver.findElement(By.id("file-submit")).click();

         Thread.sleep(2000);

         driver.get("https://the-internet.herokuapp.com/download");

         driver.findElement(By.linkText("headphones.png")).click();
    }
}
