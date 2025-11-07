package dsi_test_regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

public class MyListener implements ITestListener
{
    WebDriver driver;
    WebDriverWait wait;

    public void onStart(ITestContext context)
    {
        System.out.println("on start");
    }
    public void onTestStart(ITestResult context)
    {
        System.out.println("on Test start");
    }
    public void onTestSuccess(ITestResult context)
    {
        System.out.println("on Test success");
    }
    public void onTestFailure(ITestResult context)
    {
        System.out.println("Test fail");
    }

    public void onTestSkipped(ITestResult context)
    {
        System.out.println("Test skipped");
    }
    public void onFinish(ITestContext context)
    {
        System.out.println("on_Finish");
    }
}
