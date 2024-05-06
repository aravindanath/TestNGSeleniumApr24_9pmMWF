package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/checkbox");

       WebElement ele = driver.findElement(By.xpath("//select[@id='cars']"));


       Thread.sleep(2000);

       Generic.selectByVisibleText(ele, "Audi");
        Generic.selectByVisibleText(ele, "Volvo");

        Generic.selectByVisibleText(ele, "Saab");

        Thread.sleep(2000);

        Generic.deSelectByVisibleText(ele, "Audi");
        Thread.sleep(2000);
        Generic.deSelectAll(ele);
    }
}
