package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.enums.Browser;
import br.com.chronosAcademy.pages.CursosPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursosPage cursosPage;



    @BeforeClass
    public void inicializaTeste(){
        driverWeb = new Driver(Browser.CHROME);
        driver = driverWeb.getDriver();
        driver.get("http://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }

    @Test
    public void primeiroTeste(){
        System.out.println("primeiroTeste()");
        String titulo = principalPage.getTitulo();
        System.out.println("titulo obtido: "+titulo);

        Assert.assertEquals("Porque Tempo É Conhecimento", titulo);
        //Assert.assertEquals("PROFESSOR QUALIFICADO", txtProfessor.getText());
    }

    @Test
    public void segundoTeste(){
        System.out.println("segundoTeste()");
        principalPage.clickBotao();

        cursosPage = new CursosPage(driver);
        System.out.println("segundoTeste()");
        String titulo = cursosPage.getTitulo2();
        System.out.println("titulo obtido: "+titulo);
        Assert.assertEquals("Conheça todos os nossos cursos", titulo);

    }


    @AfterClass
    public void finalizaTeste(){
    System.out.println("finalizaTeste()");
        driver.quit();

    }
}
