import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;

public class ProjectHook {

    public static WebDriver driver;

    @BeforeScenario
        public void setUp() {
        System.out.println("------------------------------------");
        System.out.println("Test started, Opening Chrome Browser");
        System.out.println("------------------------------------");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeyne\\IdeaProjects\\SeleniumTutorial\\chromedriver.exe");

        // ChromeOptions to block notifications
        ChromeOptions options = new ChromeOptions();

        // Disable notifications
        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
        options.setExperimentalOption("prefs", prefs);

        //Starts the Chrome browser with options
        driver = new ChromeDriver(options);

        //Maximize window
        driver.manage().window().maximize();
    }

        @AfterScenario
        public void cleanUp() {

            System.out.println("------------------------------------");
            System.out.println("Test completed, Closing the browser");
            System.out.println("------------------------------------");

        // Quit the driver
        if (driver != null) {
            driver.quit();
        }
    }
}


