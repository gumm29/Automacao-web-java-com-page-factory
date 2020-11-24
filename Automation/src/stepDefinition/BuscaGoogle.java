package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import pages.Home;
import pages.LinkPage;
import pages.Search;
import config.SetUp;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscaGoogle extends SetUp{
  Home home;
  Search search;
  LinkPage page;

  @Dado("que acesso o site")
  public void que_acesso_o_site(){
	home = PageFactory.initElements(driver, Home.class);
  }

  @Quando("^pesquiso por \"([^\"]*)\"$")
  public void pesquiso_por(String pesquisa) throws Throwable {
    home.search(pesquisa);
  }
  
  @Quando("clico no primeiro link")
  public void clico_no_primeiro_link() throws Throwable {
	search =  PageFactory.initElements(driver, Search.class);
	search.clickFirstLink();
  }

  @Entao("valido a busca")
  public void valido_a_busca() throws Throwable {
	  page = PageFactory.initElements(driver, LinkPage.class);
	  assertTrue(page.textPage().contains("Software"));
	  driver.close();
  }
}