package LearningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleAssertions extends BaseTestNew {

    @Test
    public void assertionexampl(){

        driver.get("https://www.google.com");

       String title = driver.getTitle();

        Assert.assertEquals(title,"Google","Assertion Fail");

        WebElement textbox= driver.findElement(By.id("APjFqb"));

       boolean txt=  textbox.isDisplayed();

       Assert.assertFalse(txt, "text field is displayed");

    }

}
