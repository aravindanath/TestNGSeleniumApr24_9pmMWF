package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class WaitsExample extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[text()='Start']")).click();

       WebElement text =  driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        Generic.waitForElement(driver,text);
        System.out.println(text.getText());
    }
}
