package Day1;
import org.testng.annotations.Test;

public class _1_Intro {
    //public static void main(String[] args) {
        //go to the page
        // login
        //add to cart
        //check out
    //}


    @Test
    public void loginTest() {
        System.out.println("login test is successful");
    }

    @Test /// we can choose priority by @test(preiority=1...)
    public void addToCartTest() {
        System.out.println("add to cart is successful");
    }
    @Test
    public void checkOUtTest(){
        System.out.println("checkout is successful");
    }



}
