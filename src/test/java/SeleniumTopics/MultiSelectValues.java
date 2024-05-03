package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MultiSelectValues extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://www.godigit.com/");

        driver.findElement(By.xpath("(//ul[@class='quote-form-switcher quote-form-switcher--margin-bottom hidden-xs hidden-sm']/li/a)[5]")).click();

        driver.findElement(By.xpath("//a[text()='Country']")).click();

        List<WebElement> country  = driver.findElements(By.xpath("//div[@class='popular-countrylist']/ul/li/a"));

        for(WebElement c : country){
           // if(c.getText().equalsIgnoreCase("Spain") || c.getText().equalsIgnoreCase("Maldives") ||c.getText().equalsIgnoreCase("Turkey")){
                c.click();
//                break;
           // }
        }

    }
}
