package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.EnvironmentConfiguration;

import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxCapabilities implements ICapabilities {

    private FirefoxOptions options = new FirefoxOptions();
    private WebDriver driver;

    public FirefoxCapabilities() {
        setCapabilities();
    }

    @Override
    public void setCapabilities() {
        this.caps.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
        this.caps.setAcceptInsecureCerts(true);
        this.caps.setJavascriptEnabled(true);
        this.caps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);

        try {
            this.setDriver(new RemoteWebDriver(new URL(EnvironmentConfiguration.REMOTE_URL), this.caps));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setDriver(RemoteWebDriver driver) {
        this.driver = driver;
    }

    @Override
    public WebDriver getDriver() {
        return this.driver;
    }
}
