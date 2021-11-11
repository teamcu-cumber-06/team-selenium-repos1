package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class OpenBrowserUsingDriver {
    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://www.bbc.co.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/subdrivers/mydrivers/chromedriver.exe");
       // System.setProperty
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        //  driver.manage().window().maximize();
        String siteTitle = driver.getTitle();
        System.out.println(siteTitle);
        // Thread.sleep(3000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@href=\"https://session.bbc.co.uk/session?lang=en-GB&ptrt=https://www.bbc.co.uk/\"]")).click();
        driver.findElement(By.id("user-identifier-input")).sendKeys("aba@bbc.co.uk");
        driver.findElement(By.name("password")).sendKeys("bbbbbbaaa");
        driver.findElement(By.id("submit-button")).click();
        String passMsg=driver.findElement(By.id("form-message-password")).getText();
        System.out.println("Password error message" +passMsg);
        if(Objects.equals(passMsg, "Sorry, that password isn't valid. Please include something that isn't a letter.")){
            System.out.println("Password scenario worked");
        }else{
            System.out.println("oopppssss..... bang...bang....");
        }

/*        Dimension newDimension = new Dimension(800,600);
        driver.manage().window().setSize(newDimension);
        System.out.println(driver.manage().window().getPosition());*/

      /*  Point newPoint = new Point(200,50);
        driver.manage().window().setPosition(newPoint);
        System.out.println("New custom set position is: "+driver.manage().window().getPosition());
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(700,50));
        System.out.println(driver.manage().window().getPosition());
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(1200,900));
        System.out.println(driver.manage().window().getSize());*/

       /* driver.findElement(By.xpath("//*[contains(@href,\"/news/coronavirus\")]")).click();
        //    Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href=\"/news/science-environment-56837908\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/news/world\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/news/world/asia\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/news/world/asia/india\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"orb-search-q\"]")).sendKeys("Pizza");
        driver.findElement(By.xpath("//button[@class=\"se-searchbox__submit\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/search\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"search-input\"]")).sendKeys("Diwali");
        driver.findElement(By.xpath("//button[@data-testid=\"test-search-submit\"]")).click();*/



/*
      //  JavascriptExecutor jse = (JavascriptExecutor)driver;
     //   jse.executeScript("window.open()");
        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.navigate().to("https://www.sky.com/");
*/


    }
}
