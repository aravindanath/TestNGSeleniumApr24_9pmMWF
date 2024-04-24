package SeleniumLocators;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorsByXpath2 extends BaseTestNew {

    @Test
    public void byID() throws InterruptedException {
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(text(),'Today')]")).click();


        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links: " + links.size());

        for (WebElement link :links){
            System.out.println(link.getText() + " --> " + link.getAttribute("href"));
        }

        driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
    }
}
