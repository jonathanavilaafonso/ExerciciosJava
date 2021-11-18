package br.com.dio.exercicios.loops;

import java.util.Scanner;

class exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;



        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantidadePares++;          //para somar pares e impares
            else quantidadeImpares++;



            count = count + 1;


        } while (count < quantidadeNumeros);

        System.out.println("Quantidade Pares: " + quantidadePares);
        System.out.println("Quantidade Impares: " + quantidadeImpares);








    }
}

