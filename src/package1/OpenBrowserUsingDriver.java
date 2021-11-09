package package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserUsingDriver {

    public static void main(String[] args) throws InterruptedException{


        String baseUrl = "https://www.bbc.co.uk/";

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
      //  driver.manage().window().maximize();
        String siteTitle = driver.getTitle();
        System.out.println(siteTitle);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Dimension newDimension = new Dimension(800,600);
        driver.manage().window().setSize(newDimension);
        System.out.println(driver.manage().window().getPosition());

        Point newPoint = new Point(200,50);
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
        System.out.println(driver.manage().window().getSize());
        System.out.println("Added by Kishan");








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
