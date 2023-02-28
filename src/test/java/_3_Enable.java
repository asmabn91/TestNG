import org.testng.annotations.Test;

public class _3_Enable {
    @Test
    void test1(){
        System.out.println(" test1 is successful");
    }
    @Test(enabled = false)
    void test2(){
        System.out.println(" test2 is successful");

    }
    @Test
    void test3(){
        System.out.println(" test3 is successful");
    }
}
