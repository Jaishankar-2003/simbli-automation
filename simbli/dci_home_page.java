package dsi_test_regression;

import org.apache.jena.base.Sys;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class dci_home_page
{
        WebDriver driver;
        Actions action;
        WebDriverWait wait;
        dci_home_page(WebDriver driver)
        {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            PageFactory.initElements(driver,this); //mandatory
        }

    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



    }

