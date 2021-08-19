package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var HoversPage = homePage.clickHovers();
        var caption = HoversPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }
}
