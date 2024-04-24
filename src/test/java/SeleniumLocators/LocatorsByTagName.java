package SeleniumLocators;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorsByTagName extends BaseTestNew {

    @Test
    public void byID() throws InterruptedException {
        driver.get("https://www.flipkart.com");

       List<WebElement> links = driver.findElements(By.tagName("a"));

       System.out.println("Total links: " + links.size());

       for (WebElement link :links){
           System.out.println(link.getText() + " --> " + link.getAttribute("href"));
       }

    }
}
