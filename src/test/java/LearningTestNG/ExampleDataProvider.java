package LearningTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleDataProvider {


    @DataProvider
    public Object[][] data(){
        Object[][] data = new Object[2][2];
        data[0][0] ="arvind@test.com";
        data[0][1] ="password1234";
        data[1][0] ="arjun@test.com";
        data[1][1] ="password1234";
        return data;
    }

    @Test(dataProvider = "data")
    public void test(String un, String pw){
        System.out.println("un: " + un);
        System.out.println("Pw: " + pw);
    }
}
