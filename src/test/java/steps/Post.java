package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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



    @Given("^que acesso o site da iterays$")
    public void que_acesso_o_site_da_iterays() throws Throwable {
        base.driver.get(url);

    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquiso_por(String produto) throws Throwable {
       base.driver.findElement(By.id("searchtext")).sendKeys(produto + Keys.ENTER);

    }



}



