package br.com.chronosAcademy.steps;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.enums.Browser;
import br.com.chronosAcademy.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {
    LoginPage loginPage;

    @Before
    public void iniciaNavegador(){
        new Driver(Browser.CHROME);
    }
    @After
    public void fechaNavegador(){
        Driver.getDriver().quit();
    }


    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida(){
        Driver.getDriver().get("https://www.advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
    }
    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickDivFecharModal();
    }
    @Entao("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() throws Exception {
        try{
            loginPage.invisibilityOfBtnFechar();
        }catch (Exception e){
            throw new Exception("janela modal não foi fechada");
        }
    }

    @Quando("for realizado um clique no icone de fechar a modal")
    public void forRealizadoUmCliqueNoIconeDeFecharAModal() {
        loginPage.clickBtnFechar();
    }

    @Quando("for realizado um clique no link Create New Account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
    }

    @Entao("a pagina Creat Account deve ser exibida")
    public void aPaginaCreatAccountDeveSerExibida() {
        
    }

    @Quando("os campos de login sejam preenchidos da seguinte forma")
    public void osCamposDeLoginSejamPreenchidosDaSeguinteForma(Map<String, String> map){
        String username = map.get("usuario");
        String password = map.get("senha");
        boolean remember = Boolean.parseBoolean(map.get("remember"));

        loginPage.setInpUserName(username);
        loginPage.setInpPassword(password);
        if (remember)loginPage.clickInpRemember();
    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn(){
        loginPage.isBtnSignIn();
        
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {
        
    }

    @Entao("o sistema deve exibir uma mensagem de erro")
    public void oSistemaDeveExibirUmaMensagemDeErro() {
        
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado(){
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);

    }
}
