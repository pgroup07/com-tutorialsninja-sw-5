package tutorialsninja.com.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tutorialsninja.com.propertyreader.PropertyReader;
import tutorialsninja.com.utility.Utility;

/**
 * Created by Jay Vaghani
 */
public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeBrowser();
    }
}
