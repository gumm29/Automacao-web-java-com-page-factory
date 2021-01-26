package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search {
  @FindBy(xpath= "//div[@class='yuRUbf']/a" )
  private List<WebElement> searchLink;

  public void clickFirstLink() {
    searchLink.get(0).click();
  }
}
