package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;


    @BeforeClass
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");

        driver = driverWeb.getDriver();

        driver.get("http://www.chronosacademy.com.br");


    }

    @Test
    public void primeiroteste(){
        System.out.println("primeiroteste()");
        String xpathTitulo  = "//section[2]//h4";
        //String xpathProfessor = "//section[4]/div[2]/div/div/div/div/section/div/div/div[2]/div/div/div/div/div/div[2]//span";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        //WebElement txtProfessor = driver.findElement(By.xpath(xpathProfessor));
        String titulo = txtTitulo.getText();
        System.out.println("titulo obtido: "+titulo);
        //System.out.println("titulo: "+txtProfessor.getText());

        Assert.assertEquals("Porque Tempo É Conhecimento", titulo);
        //Assert.assertEquals("PROFESSOR QUALIFICADO", txtProfessor.getText());

    }

    @AfterClass
    public void finalizaTeste(){
    System.out.println("finalizaTeste()");
        driver.quit();

    }
}
