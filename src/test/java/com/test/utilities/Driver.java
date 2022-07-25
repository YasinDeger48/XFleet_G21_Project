package com.test.utilities;

import com.github.dockerjava.api.model.ContainerNetwork;
import com.github.dockerjava.api.model.NetworkSettings;
import com.google.common.collect.ImmutableMap;
import com.google.common.graph.Network;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.net.NetworkUtils;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {
    }

    //private static WebDriver driver;

    //private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    public static WebDriver getDriver()  {

        if (driverPool.get() == null) {

            String browser = ConfigurationReader.getProperty("browser");

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driverPool.set(new SafariDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "standalone-grid":

                    try {
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions chromeOptions = new ChromeOptions();
                        driverPool.set(new RemoteWebDriver(new URL("http://192.168.1.105:4444"), chromeOptions));
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;

                case "grid-remote-chrome":
                    String gridAdress = "35.171.6.92";
                    try {
                        URL url = new URL("http://"+gridAdress+":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        driverPool.set(new RemoteWebDriver(url,desiredCapabilities));
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;

                case "grid-remote-firefox":
                    String gridAddress = "35.171.6.92";
                    try {
                        URL url = new URL("http://"+gridAddress+":4444/wd/hub");
                        DesiredCapabilities desiredCapability = new DesiredCapabilities();
                        desiredCapability.setBrowserName("firefox");
                        driverPool.set(new RemoteWebDriver(url,desiredCapability));
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;

            }

        }
        return driverPool.get();
    }

    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();

        }
    }

}
