package Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _5_Assertions {
    @Test
    void test19(){
        String str1="john";
        String str2="John";
        Assert.assertEquals(str1,str2,"test is not succesful");
    }
    @Test
    void test2(){
        String str1="john";
        String str2="Snow";
        Assert.assertNotEquals(str1,str2,"test is not successful");
    }
    @Test
    void test3(){
        int num1=54;
        int num2=37;
        Assert.assertTrue(num1==num2,"test not successful");
    }
    @Test
    void test4() {
        int num1 = 54;
        int num2 = 54;

        Assert.assertTrue(num1 == num2, "Test is not successful");
    }

    @Test
    void test5() {
        String name = "John";
        Assert.assertNull(name, "Test is not successful");
    }

    @Test
    void test6() {
        String name = "John";

        Assert.fail("Test fails anyways");
    }

}
