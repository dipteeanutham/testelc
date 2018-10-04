package com.elc.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.elc.qa.util.Testutil;
import com.elc.qa.util.WebEventListner;

public class TestBase {
	public static WebDriver driver; 
	public static Properties pro;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListner eventListener;

	
	
public TestBase() throws IOException {
		pro=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Selenium\\elcBuyTest\\src\\main\\java\\com\\elc\\qa\\config\\config.properties");
		pro.load(fis);
	}
public void intialization() throws IOException {
	String browsername=pro.getProperty("browser");
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	} else if(browsername.equals("ff")){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Deepti\\Downloads\\geckodriver-v0.21.0-win64");
		driver = new FirefoxDriver();
	}
	e_driver = new EventFiringWebDriver(driver);
	// Now create object of EventListerHandler to register it with EventFiringWebDriver
	eventListener = new WebEventListner();
	e_driver.register(eventListener);
	driver = e_driver;

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Testutil.page_load_time, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Testutil.implicit_wait_time,TimeUnit.SECONDS);
	driver.get(pro.getProperty("url"));
}

}
