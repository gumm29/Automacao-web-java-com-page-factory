package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
  @FindBy(name = "q" )
  private WebElement inputSearch;

  public void search(String pesquisa){
    inputSearch.sendKeys(pesquisa);
    inputSearch.submit();
  }
}