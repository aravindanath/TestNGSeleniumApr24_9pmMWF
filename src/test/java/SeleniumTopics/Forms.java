package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Forms extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/automation-practice-form");

       List<WebElement> rb = driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/label"));

       for(WebElement r : rb){

           if(r.getText().equalsIgnoreCase("male")){
               r.click();
           }
       }

       Thread.sleep(2000);
       WebElement element = driver.findElement(By.xpath("//label[text()='Hobbies']"));

       Generic.ScrollToElement(driver, element);


       List<WebElement> cb = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']/label"));

       for(WebElement c : cb){
           if(c.getText().equalsIgnoreCase("Reading")) {
               c.click();
           }
       }


        }

    }

