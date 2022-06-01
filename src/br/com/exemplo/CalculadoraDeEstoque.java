package br.com.exemplo;

public class CalculadoraDeEstoque {

    public static void main(String[] args) {

        double soma = 0;
        int contador = 0;

        while (contador < 35) {
            double valorDoLivro = 59.90;
            soma = soma + valorDoLivro;
            contador = contador + 1;
            System.out.println(" O total em estoque é" + soma);


            if (soma < 150) {
                System.out.println("Estoque baixo");


            } else {
                System.out.println("Estoque ok");
            }
        }
    }
}

