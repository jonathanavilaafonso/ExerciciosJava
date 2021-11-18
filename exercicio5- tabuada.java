package br.com.dio.exercicios.loops;

import jdk.management.jfr.FlightRecorderMXBean;

import java.util.Scanner;

class exercicio5 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Tabuada: ");


        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10;i = i + 1) {

            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));


        }

    }

}
