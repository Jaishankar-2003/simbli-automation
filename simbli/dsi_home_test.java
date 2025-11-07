package dsi_test_regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

@Listeners(dsi_test_regression.Extend_report.class)
public class dsi_home_test
{
    WebDriver driver;

    @BeforeClass
    public void setup()
    {
       driver = new ChromeDriver();
       driver.get("https://www.dotcominfoway.com/");
       driver.manage().window().maximize();
    }

    @BeforeMethod
    public void attachDriverToContext(ITestResult result)
    {
        result.setAttribute("exceptionDriver", driver);
    }






    @AfterClass
    void terminate()
    {
        driver.quit();
    }
}
