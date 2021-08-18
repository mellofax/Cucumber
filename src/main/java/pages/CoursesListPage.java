package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursesListPage {
    WebDriver driver;
    public CoursesListPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void selectCourse(String course)
    {
        driver.findElement(new By.ByXPath(String.format("//strong[text()='%s']", course))).click();
    }
}
