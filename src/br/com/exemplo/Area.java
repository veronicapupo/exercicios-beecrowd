package br.com.exemplo;


import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double n = 3.14159;
        double area = (n * Math.pow(raio, 2));
        System.out.println("A = " + String.format("%.4f", area));
    }
}
