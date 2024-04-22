package LearningTestNG;

import org.testng.annotations.Test;

public class Annotations_2 {


    @Test
    public void testA(){
        System.out.println("Test 1");
    }

    @Test(priority = 4)
    public void testB(){
        System.out.println("Test 2");
    }

    @Test
    public void Atest(){
        System.out.println("Test 3");
    }

    @Test(priority = 1)
    public void Best(){
        System.out.println("Test 4");
    }
}

