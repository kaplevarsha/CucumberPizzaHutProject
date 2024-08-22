package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Hooks {
	
	public static WebDriver driver;

    @Before
    public void setUp() {
       
    	WebDriverManager.chromedriver().clearDriverCache().setup();
    	
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
      /*  if (driver != null) {
            driver.quit(); */
    	
        }
    }


