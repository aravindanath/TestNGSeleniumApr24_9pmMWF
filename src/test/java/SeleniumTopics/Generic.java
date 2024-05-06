package SeleniumTopics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

}
