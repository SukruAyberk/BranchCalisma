package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class SelcukTest20001 {
    @Test
    public void zartZortTesting(){
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        TestOtomasyonPage testOtomasyonPage = new TestOtomasyonPage();

        testOtomasyonPage.testBar.sendKeys("phone" + Keys.ENTER);

        String actualBulunanUrunSayisiElementiText = testOtomasyonPage.bulunanUrunSayisiElementi.getText();
        String expectedBulunanUrunSayisiElementiText = "4 Products Found";

        Assert.assertEquals(actualBulunanUrunSayisiElementiText,expectedBulunanUrunSayisiElementiText);

    }
}
