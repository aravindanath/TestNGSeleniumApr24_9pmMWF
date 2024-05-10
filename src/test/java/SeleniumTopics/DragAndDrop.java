package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");

        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("(//li[@id='fourth']/a)[1]"));
        WebElement element2 = driver.findElement(By.xpath("//ol[@id='amt7']/li"));

        Generic.dragAndDrop(driver, element1, element2);


    }
}
