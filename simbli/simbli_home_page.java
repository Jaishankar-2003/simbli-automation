
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

public class simbli_home_page
{
        WebDriver driver;
        Actions action;
        WebDriverWait wait;
        public simbli_home_page(WebDriver driver)
        {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            PageFactory.initElements(driver,this); //mandatory
        }

        // about
        @FindBy(xpath = "//p[normalize-space()='About Us']") WebElement about;
        @FindBy(xpath = "//h1[normalize-space()='SMART AGENTS SMARTER WORKFLOWS SIMPLEST SETUP']") WebElement about_v1;
        @FindBy(xpath = "//div[contains(@class,'robot-images-about')]//img") WebElement about_img;
        @FindBy(xpath = "(//div[contains(@class,'about-text ps-lg-5')]) ") WebElement aboutv2;
        @FindBy(xpath = "(//div[contains(@class,'about-cards-overlay mt-5 ps-lg-5')])") WebElement aboutv3;
        @FindBy(xpath = "(//div[@class='col-lg-6 col-12 aos-init aos-animate'])[1]") WebElement aboutv4;
        @FindBy(xpath = "(//div[contains(@class,'col-lg-6 col-12 mt-lg-0 mt-4 aos-init aos-animate')])[1]") WebElement aboutv5;

        @FindBy(xpath = "(//div[@class='rocket-back px-lg-5 px-2 py-5 row d-flex align-items-center '])[1]") WebElement about_agent_box;
        @FindBy(xpath = "(//h5[@class='col-lg-12 '])[1]") WebElement about_agent_text;
        @FindBy(xpath = "//img[@alt='roc']") WebElement about_rocket;
        @FindBy(xpath = "//button[normalize-space()='Explore Our Agents']") WebElement about_explore_button;

        public void aboutpanel()
        {
            System.out.println("about is Displayed : " + about.isDisplayed());
            System.out.println("about is Enable : " + about.isEnabled());

            about.click();

            if(about_v1.isDisplayed() && about_img.isDisplayed() && aboutv2.isDisplayed() && aboutv3.isDisplayed() && aboutv4.isDisplayed() && aboutv5.isDisplayed())
            {
                System.out.println("simbli about visible successfully");
            }

            if(about_agent_box.isDisplayed())
            {
                System.out.println("about ai agent box is displaying");
                if(about_agent_text.isDisplayed() && about_rocket.isDisplayed() && about_explore_button.isDisplayed() && about_explore_button.isEnabled())
                {
                    System.out.println("about ai agent box inside components displaying");
                }
                else
                {
                    System.out.println("about ai agent box inside components not displaying");
                }
            }
            else
            {
                System.out.println(" about ai agent box is not displaying");
            }




        }


    }

