package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResultText(),"You successfully clicked an alert","Results text incorrect");
    }

    @Test
    public void testGetTextfromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        Assert.assertEquals(alertsPage.alert_getText(),"I am a JS Confirm", "Alert Text incorrect");

    }

    @Test
    public void testCancelAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        alertsPage.alert_clickToDismiss();
        Assert.assertEquals(alertsPage.getResultText(),"You clicked: Cancel", "Results text incorrect");
    }

    @Test
    public void testSetInput(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU rocks!";
        alertsPage.alert_setText(text);
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResultText(),"You entered: TAU rocks!", "Results text incorrect");
    }
}
