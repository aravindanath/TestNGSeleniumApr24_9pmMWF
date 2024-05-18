package SeleniumTopics;

import LearningTestNG.BaseTestNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandling extends BaseTestNew{

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Thread.sleep(1000);

        Generic.acceptAlert(driver);

        WebElement result = driver.findElement(By.id("result"));

        System.out.println("Result: " + result.getText());

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Thread.sleep(1000);

        Generic.dismissAlert(driver);

        System.out.println("Result: " + result.getText());

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Thread.sleep(1000);

        Generic.acceptAlert(driver, "Hello all");

    }
}
