package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var wysiwigeditorpage = homePage.clickWysiwygEditor();
        String text1 = "hello ";
        String text2 = "world";
        wysiwigeditorpage.clearTextArea();
        wysiwigeditorpage.setTextArea(text1);
        wysiwigeditorpage.decreaseIdentation();
        wysiwigeditorpage.setTextArea(text2);
        Assert.assertEquals(wysiwigeditorpage.getTextFromEditor(),text1+text2,"Entered text incorrect");
    }
}
