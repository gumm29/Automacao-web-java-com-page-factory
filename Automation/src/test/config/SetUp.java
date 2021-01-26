package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
  public WebDriver driver;
  public SetUp(){
    System.setProperty("webdriver.chrome.driver", "C:\\windows\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.navigate().to("http://www.google.com");
  }

  public void tearsDown(){
    driver.close();
  }
}