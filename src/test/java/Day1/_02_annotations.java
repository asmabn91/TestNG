package Day1;

import org.testng.annotations.*;

public class _02_annotations {
    //beforemethod:this code will run before all test annotations
    //we use annotations to write our tests
    //aftermethod:this code will run after annotations
    //afterclass:code will be run after the class
    @BeforeClass
    void beforeClass() {
        System.out.println("before class is working");
    }


    @BeforeMethod
    void beforeMethod(){
        System.out.println("before method is working");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("after method is working");
    }
    @AfterClass
    void afterclass(){
        System.out.println("after class is working");
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
