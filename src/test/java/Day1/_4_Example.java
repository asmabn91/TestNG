package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _4_Example {
    // go to https://opencart.abstracta.us/index.php?route=account/login
    //login// email: testngusbatch@gmail.com// password:usbatch1234

    @Test
    void loginTest() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement username= driver.findElement(By.id("input-email"));
        username.sendKeys("testngusbatch@gmail.com");
        WebElement passWord= driver.findElement(By.id("input-password"));
        passWord.sendKeys("usbatch1234");
        WebElement loginbutton= driver.findElement(By.xpath("//input[@type='submit']"));
        loginbutton.click();
        WebElement myAccountHeader= driver.findElement(By.xpath("(//div[@id='content']//h2)[1]"));

         //if (myAccountHeader.isDisplayed()){
            // System.out.println(myAccountHeader.getText().equals("My Account1"));
        // }
        Assert.assertEquals(myAccountHeader.getText(),"My Account","Test is successful");

            Thread.sleep(3000);
            driver.quit();



    }



}
