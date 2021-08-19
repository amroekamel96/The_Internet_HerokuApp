package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressesPage {
    public WebDriver driver;
    private By inputField = By.id("target");
    private By resultField = By.id("result");

    public KeyPressesPage (WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

/*    public void enterPi(){
        Actions actions = new Actions(driver);
        enterText(actions.keyDown(Keys.)+"227"+actions.keyUp(Keys.ALT));
    }*/

    public String getResult(){
        return driver.findElement(resultField).getText();
    }


}
