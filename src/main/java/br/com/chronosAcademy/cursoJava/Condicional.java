package br.com.chronosAcademy.cursoJava;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Condicional {

    @Test
    public void principal() throws IOException {
        //Scanner ler = new Scanner(System.in);
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        float media = 0;
        System.out.println("digite o valor da nota");
        a = 8;
        System.out.println("valor digitado "+ a);

        System.out.println("digite o valor da nota");
        b = 5;
        System.out.println("valor digitado "+ b);

        System.out.println("digite o valor da nota");
        c = 6;
        System.out.println("valor digitado "+ c);

        System.out.println("digite o valor da nota");
        d = 4;
        System.out.println("valor digitado "+ d);
        media = obterMedia(a,b,c,d);
        System.out.println("media calculada "+ media);
        System.out.println("de acordo com as notas o aluno foi "+ validarMedia(media));
    }

    private Float obterMedia(int valor1,int valor2,int valor3,int valor4){
        float media = 0;
        media = (valor1+valor2+valor3+valor4)/4;
        return media;
    }

    private String validarMedia(float media){
        if (media>5){
            return "aprovado";
        }else {
            return "reprovado";
        }


    }

}
