package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.TestOtomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestHalil {

    TestOtomasyonPage testOtomasyonPage = new TestOtomasyonPage();
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        testOtomasyonPage.testBar.sendKeys("phone" + Keys.ENTER);
        System.out.println("Ben kod bilmeyen");
    }
}
