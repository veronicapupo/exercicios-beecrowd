package br.com.exemplo;

import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura = scanner.nextDouble();
        double peso = scanner.nextDouble();
        double imc = peso / (altura * altura);

        System.out.println(imc);
        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc <= 24.9) {
            System.out.println("Normal");
        } else if (imc <= 29.90) {
            System.out.println("Sobrepeso");
        } else if (imc <= 39.90) {
            System.out.println("Obesidade");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade Grave");
        }
    }


}
