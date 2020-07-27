package utils;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class EnvironmentConfiguration {

    /**
     * Command line.
     */
    private static final String environment = System.getProperty("environment.name", "local");
    private static final Config resources = ConfigFactory.parseResources(String.format("%s-environment.conf", environment));

    /**
     * BROWSER.
     */
    public static final String BROWSER_NAME = System.getProperty("browser.name", "chrome");

    /**
     * SELENIUM
     */
    public static final String REMOTE_URL = resources.getString("selenium.remote_url");
    public static final String BASE_URL = resources.getString("selenium.base_url");

    /**
     * Private constructor.
     */
    private EnvironmentConfiguration() { }

}
