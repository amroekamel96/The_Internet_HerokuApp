package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadpage = homePage.clickFileUpload();
        uploadpage.uploadFile("C:\\Users\\TopTechnology\\Downloads\\Amro.jpg");
        Assert.assertEquals(uploadpage.getUploadedFiles(),"Amro.jpg","Uploaded Files Incorrect");
    }

}
