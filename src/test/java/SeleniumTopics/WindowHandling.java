package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class WindowHandling extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://www.amazon.in");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15 pro max", Keys.ENTER);

        String parentWin = driver.getWindowHandle();


        List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        list.get(3).click();

        Set<String> wins =  driver.getWindowHandles();

        for(String win : wins){
//            System.out.println(win );
            driver.switchTo().window(win);
        }

        System.out.println("Child Win Title"+driver.getTitle());

       String price=  driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")).getText();

        System.out.println("Price: " + price);

        driver.close();

        driver.switchTo().window(parentWin);

        System.out.println("Parent Win Title"+driver.getTitle());

    }
}
