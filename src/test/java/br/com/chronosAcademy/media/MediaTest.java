package br.com.chronosAcademy.media;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {


    @Test
    public void validaAprovado(){
        Media media = new Media();
        String resultado = media.calculaMedia(5.0,5.0);
        assertEquals("Aprovado", resultado);
      }

    @Test
    public void validaReprovado(){
        Media media = new Media();
        String resultado = media.calculaMedia(4.9,5.0);
        //String resultado = subtraiValor(10,5)+"";

        assertEquals("Reprovado", resultado);
    }

    public int subtraiValor(int v1, int v2){
        return v1-v2;
    }
    public int multiplicaValor(int v1, int v2){
        return v1*v2;
    }
}
