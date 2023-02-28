package Day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _02_annotations {
    //beforemethod:this code will run before all test annotations
    //we use annotations to write our tests
    //aftermethod:this code will run after annotations
    //afterclass:code will be run after the class
    @BeforeMethod
    void beforeMethod(){
        System.out.println("before method is working");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("after method is working");
    }
    @Test
     void test1 (){
        System.out.println("test 1 is successful");
    }
    @Test
    void test2(){
        System.out.println("test 2 is successful");
    }
    @BeforeMethod
    void beforeMethod2(){
        System.out.println("before method 2 is working");
    }
}
