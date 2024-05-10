package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MouseHover extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://www.indusind.com/in/en/personal.html#");

        driver.findElement(By.xpath("(//a[@class='close'])[1]")).click();

            Thread.sleep(2000);
       WebElement element =  driver.findElement(By.xpath("//a[text()='Make Payments']"));


       Generic.moouseHover(driver, element);

        Thread.sleep(2000);
       WebElement ccPay = driver.findElement(By.linkText("Credit Card Payment"));

       Generic.click(driver, ccPay);

       Thread.sleep(2000);
       Generic.rightClck(driver);
    }
}
