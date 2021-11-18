package br.com.dio.exercicios.loops;

import java.util.Scanner;

class exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");

        int fatorial = scan.nextInt();

        int multipicacao = 1;

        System.out.println(fatorial +"! = ");

        for (int i  = fatorial ; i >= 1  ; i --) {
            multipicacao = multipicacao * i;

        }

        System.out.println(multipicacao);


    }

}
