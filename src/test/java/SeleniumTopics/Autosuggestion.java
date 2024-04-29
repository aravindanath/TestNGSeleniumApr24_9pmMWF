package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Autosuggestion extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://www.redbus.in/");

        driver.findElement(By.id("src")).sendKeys("Bang");

        Thread.sleep(3000);

        List<WebElement> src =  driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li/div/text[1]"));


        System.out.println("Total Pickup points: " + src.size());

        for(WebElement srcElement : src){
//            System.out.println(srcElement.getText());
            if(srcElement.getText().equalsIgnoreCase("Satellite Bus Stand")){
                srcElement.click();
                break;
            }
        }

        driver.findElement(By.cssSelector("#dest")).sendKeys("Hyd");


        Thread.sleep(3000);

        List<WebElement> dest =  driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li/div/text[1]"));


        System.out.println("Total Drop points: " + dest.size());

        for(WebElement srcElement : dest){
//            System.out.println(srcElement.getText());
            if(srcElement.getText().equalsIgnoreCase("Jubilee Bus Station JBS")){
                srcElement.click();
                break;
            }
        }

    }
}
