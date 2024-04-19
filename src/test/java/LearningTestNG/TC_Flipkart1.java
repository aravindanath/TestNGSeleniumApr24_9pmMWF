package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Flipkart1 extends BaseTest{


    @Test
    public void test001(){
        driver.get("https://www.flipkart.com");
        Reporter.log(driver.getTitle());
        Reporter.log(driver.getCurrentUrl());
    }
}
