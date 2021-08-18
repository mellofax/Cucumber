package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AQAJavaPage {

    WebDriver driver;
    public AQAJavaPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitleText()
    {
        return driver.findElement(new By.ByXPath("//span[contains(text(),'Java')]")).getText();
    }
}
