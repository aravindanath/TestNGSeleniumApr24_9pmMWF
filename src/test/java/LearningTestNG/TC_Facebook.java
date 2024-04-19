package LearningTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Facebook extends BaseTest{


    @Test
    public void test001(){
        driver.get("https://www.facebook.com");
        Reporter.log(driver.getTitle());
        Reporter.log(driver.getCurrentUrl());
        Assert.fail("Failed");

    }
}
