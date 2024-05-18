package SeleniumTopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Generic
{


    public static void ScrollToElement(WebDriver driver, WebElement element){
        JavascriptExecutor js =  (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }


    public static void selectByVisibleText(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public static void selectByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public static void selectByindex(WebElement element, int value){
        Select select = new Select(element);
        select.selectByIndex(value);
    }

    public static void deSelectByVisibleText(WebElement element, String value){
        Select select = new Select(element);
        select.deselectByVisibleText(value);
    }

    public static void deSelectAll(WebElement element){
        Select select = new Select(element);
        select.deselectAll();
    }

    public static void deselectByIndex(WebElement element, int value){
        Select select = new Select(element);
        select.deselectByIndex(value);
    }

    public static void moouseHover(WebDriver driver,WebElement element){
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
    }

    public static void click(WebDriver driver, WebElement element){
        Actions act = new Actions(driver);
        act.click(element).perform();
    }


    public static void dragAndDrop(WebDriver driver, WebElement element1, WebElement element2){
        Actions act = new Actions(driver);
        act.dragAndDrop(element1,element2).perform();
    }

    public static void rightClck(WebDriver driver){
        Actions act = new Actions(driver);
        act.contextClick().perform();
    }


    public static void acceptAlert(WebDriver driver){
     Alert alert  =  driver.switchTo().alert();
     System.out.println(alert.getText());
     alert.accept();
    }


    public static void dismissAlert(WebDriver driver){

        driver.switchTo().alert().dismiss();

    }
    public static void acceptAlert(WebDriver driver, String text){
        Alert alert  =  driver.switchTo().alert();
        alert.sendKeys(text);
        System.out.println(alert.getText());
        alert.accept();
    }

    public static void waitForElement(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
