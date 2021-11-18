package br.com.dio.exercicios.loops;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

    class exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        int maior = 0;

        int soma = 0;



        //peça pra repetir 5x o numero

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;


            if (numero > maior) maior = numero;

            count = count + 1;

        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Soma: "+ soma);
        System.out.println("media: " + soma/5);






    }



}



