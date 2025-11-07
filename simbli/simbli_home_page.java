
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

        // Team
        @FindBy(xpath = "(//p[normalize-space()='Team'])[1]") WebElement team_click;
        @FindBy(xpath = "//h1[normalize-space()='Meet The Talented Team Who Make All This Happen']") WebElement team_text_v1;
        @FindBy(xpath = "//p[@class='team-philosophy']") WebElement team_text_v2;
        @FindBy(xpath = "//div[@class='team-section']") WebElement team_core_container;
        @FindBy(xpath = "//h2[normalize-space()='Our Core Team']") WebElement team_text_v3;
        @FindBy(xpath = "//p[normalize-space()='Talented Minds Bringing Ideas to Life.']") WebElement team_text_v4;

       // @FindBy(xpath = "(//div[@class='row justify-content-center'])[2]//div[@class='col-lg-3 col-md-6 mb-4 aos-init aos-animate']") WebElement
       List<WebElement> team_img = driver.findElements(By.xpath("(//div[@class='team-member-card'])"));

        public void aboutpanel() throws InterruptedException
        {

            System.out.println("-------- About section ----------");

            System.out.println("about is Displayed : " + about.isDisplayed());
            System.out.println("about is Enable : " + about.isEnabled());

            about.click();

            if(about_v1.isDisplayed() && about_img.isDisplayed() && aboutv2.isDisplayed() && aboutv3.isDisplayed() && aboutv4.isDisplayed() && aboutv5.isDisplayed())
            {
                System.out.println("simbli about visible successfully");
            }
            // ----------  ai agent section -------------
            if(about_agent_box.isDisplayed())
            {
                System.out.println("about ai agent box is displaying");
                Thread.sleep(3000);
                if(about_agent_text.isDisplayed() && about_rocket.isDisplayed() && about_explore_button.isDisplayed() && about_explore_button.isEnabled())
                {
                    System.out.println("about ai agent box inside components displaying");
                }
                else
                {
                    System.out.println("about ai agent box inside components not displaying");
                }

                // ------------------------------------------
            }
            else
            {
                System.out.println(" about ai agent box is not displaying");
            }

            driver.navigate().back();

            Thread.sleep(2000);
            driver.navigate().refresh();
        }

        public void team() throws InterruptedException
        {

            team_click.click();


            if(team_text_v1.isDisplayed() && team_text_v2.isDisplayed() && team_text_v3.isDisplayed() && team_text_v4.isDisplayed())
            {
                System.out.println("Team section Text contents is displaying");
            }
            Thread.sleep(3000);
            if(team_core_container.isDisplayed())
            {
                System.out.println("Team section container is displaying");

                for(int i = 0 ; i<= team_img.size() ; i++)
                {
                    System.out.println("Team image count : " +i);
                }

            }

            for(WebElement img : team_img)
            {
                System.out.println( img.getText());
            }
            Thread.sleep(3000);
            // ----------  ai agent section -------------
            if(about_agent_box.isDisplayed())
            {
                System.out.println("team ai agent box is displaying");
                Thread.sleep(3000);
                if (about_agent_text.isDisplayed() && about_rocket.isDisplayed() && about_explore_button.isDisplayed() && about_explore_button.isEnabled()) {
                    System.out.println("team ai agent box inside components displaying");
                }
                else
                {
                    System.out.println("team ai agent box inside components not displaying");
                }

                // ------------------------------------------
            }



        }


    }

