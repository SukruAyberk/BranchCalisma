package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TestSelcuk {
    @Test
    public void blablaTest(){
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    
}
