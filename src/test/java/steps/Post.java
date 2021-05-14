package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Post extends Base {

    private Base base; //Para conectar com a base o Objeto

    public Post(Base base) {

        this.base = base;
    }

    @Given("^que acesso a Wikipedia em Portugues$")
    public void que_acesso_a_Wikipedia_em_Portugues() throws Throwable {
        base.driver.get(url);
    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquiso_por(String produto) throws Throwable {
        base.driver.findElement(By.id("searchInpt")).sendKeys(produto + Keys.ENTER);
    }

//    @Entao("^exibe a expressão \"([^\"]*)\" no titulo da guia$")
//    public void exibe_a_expressão_no_titulo_da_guia(String produto) {
//      assertTrue(base.driver.getTitle().contains(produto));
//
//    }

}
