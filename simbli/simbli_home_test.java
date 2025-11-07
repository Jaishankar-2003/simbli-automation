import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

@Listeners(Extend_report.class)
public class simbli_home_test
{
    WebDriver driver;
    simbli_home_page home;
    @BeforeClass
    public void setup()
    {
       driver = new ChromeDriver();
       driver.get("https://www.simbli.ai/");
       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // <-- here
        home = new simbli_home_page(driver); // connect page object
    }

    @BeforeMethod
    public void attachDriverToContext(ITestResult result)
    {
        result.setAttribute("exceptionDriver", driver);
    }

    @Test
    public void aboutt() throws InterruptedException
    {
        home.aboutpanel();
    }





    @AfterClass
    void terminate()
    {
        driver.quit();
    }
}
