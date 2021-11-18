package br.com.dio.exercicios.loops;

import java.util.Scanner;

class exercicio2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        //ate aqui é para colocar a nota

        while (nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");

            nota = scan.nextInt();


        }


    }


}
