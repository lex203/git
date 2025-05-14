package com.guru99.demo.Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class ConfigDriver {
    public static WebDriver driver;

    public static WebDriver iniciarDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "C:\\mycode\\automatizacion_curso\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static void cerrarDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
