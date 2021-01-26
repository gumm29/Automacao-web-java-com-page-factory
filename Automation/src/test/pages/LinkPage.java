package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkPage {
  @FindBy(xpath = "//div[@class='about-text']/h2")
  private WebElement titulo;
  
  public String textPage() {
    return titulo.getText();
  }
}
