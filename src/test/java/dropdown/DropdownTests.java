package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        var DropdownPage =  homePage.clickDropdown();
        String option = "Option 1";
        DropdownPage.selectFromDropDown(option);
        var selectedOptions = DropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "option not selected");

    }
}
