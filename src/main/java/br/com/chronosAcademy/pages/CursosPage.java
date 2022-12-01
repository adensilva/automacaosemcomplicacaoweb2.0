package br.com.chronosAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CursosPage {
    WebDriver driver;

    public CursosPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo2() {
        String xpathTitulo = "//*[@id=\"block-214\"]/div/div/div/div[1]/div/div";
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathTitulo)));
        WebElement h2Titulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = h2Titulo.getText();
        return titulo;
    }
}
