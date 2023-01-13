package testcases;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.example.pages.P01_CalualoturPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_Checksum extends TestBases {
    P01_CalualoturPage calualoturPage;
    @Test(priority = 1,description = "check sum operation in the calculator")
    public void checksum (){
        calualoturPage= new P01_CalualoturPage(driver);
        calualoturPage.number1.click();
        calualoturPage.plucputton.click();
        calualoturPage.number7.click();
        calualoturPage.equalputton.click();
        Assert.assertEquals(calualoturPage.resulttext.getText(),"8");
        PageBases.captureScreenshot(driver,"sumresult");



    }

}