package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingpage = homePage.clickDynamicLoading().clickExample1();
        loadingpage.clickStart();
        Assert.assertEquals(loadingpage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
