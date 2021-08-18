package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import pages.AQAJavaPage;
import pages.CoursesListPage;

public class TMSSteps {
    WebDriver driver;

    @Before
    public void SetUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("Navigate to online cources page")
    public void navigateToOnlineCourcesPage() {
        driver.get("https://teachmeskills.by/kursy-programmirovaniya/kursy-programmirovaniya-minsk");
    }

    @When("Select {string}")
    public void select(String courseName) {
        CoursesListPage coursesListPage = new CoursesListPage(driver);
        coursesListPage.selectCourse(courseName);
    }

    @Then("I will see {string} title")
    public void iWillSeeTitle(String courseName) {
        AQAJavaPage aqaJavaPage = new AQAJavaPage(driver);
        Assert.assertEquals(aqaJavaPage.getTitleText(), courseName, "Titles are different");
    }

    @After
    public void close()
    {
        driver.close();
    }
}
