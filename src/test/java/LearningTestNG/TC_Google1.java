package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Google1  extends BaseTest{


    @Test
    public void test001(){
        driver.get("https://www.google.com");
        Reporter.log(driver.getTitle());
        Reporter.log(driver.getCurrentUrl());
    }
}
