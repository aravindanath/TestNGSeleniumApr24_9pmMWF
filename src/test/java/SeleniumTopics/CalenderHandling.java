package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CalenderHandling extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://www.expedia.co.in/");
        driver.findElement(By.xpath("//button[@name='EGDSDateRange-date-selector-trigger']")).click();

        List<WebElement> dates  =driver.findElements(By.xpath("(//table[@class='uitk-month-table'])[1]/tbody/tr/td[@class='uitk-day']/div/div[2]"));


        for(WebElement date : dates){

//            System.out.println(date.getText());
            if (date.getText().equalsIgnoreCase("29")){
                date.click();
                break;
            }
        }


    }
}
