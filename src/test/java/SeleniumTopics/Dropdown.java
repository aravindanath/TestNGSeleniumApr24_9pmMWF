package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dropdown extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://www.wikipedia.org/");

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.id("searchLanguage"));

        Generic.selectByValue(element,"nan");

        Thread.sleep(2000);
        Generic.selectByVisibleText(element,"বাংলা");
        Thread.sleep(2000);
        Generic.selectByindex(element,60);
    }
}
