package br.com.chronosAcademy.cursoJava;

import org.testng.annotations.Test;

import static org.bouncycastle.util.Arrays.append;

public class Repeticao {

    @Test

    public void principal() {
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");
//        System.out.println("6");
//        System.out.println("7");
//        System.out.println("8");
//        System.out.println("9");
//        System.out.println("10");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
    @Test
    private void treinandoForEach(){
        String[] carros = {"celta", "fusca", "uno", "cadete","escort", "kombi"};
        for (String carro: carros){
            System.out.println(carro);
        }
        System.out.println(carros.length);
        System.out.println(carros[3]);
        carros = append(carros,"palio");
        System.out.println(carros.length);
        System.out.println(carros[6]);

    }

}
