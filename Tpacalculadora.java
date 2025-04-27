/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpacalculadora;

/**
 *
 * @author larad
 */
public class Tpacalculadora {

            public static void main(String[] args) {

        // 1. Soma de 28 + 555
        System.out.println("Soma: " + soma(28, 555));

        // 2. Subtração de 75 - 11
        System.out.println("Subtração: " + subtracao(75, 11));

        // 3. Divisão de 777 por 2
        System.out.println("Divisão: " + divisao(777, 2));

        // 4. Multiplicação de 500 * 80
        System.out.println("Multiplicação: " + multiplicacao(500, 80));

        // 5. Área da circunferência (pi = 3.14, raio = 5)
        double raio = 5;
        System.out.println("Área da circunferência: " + areaCircunferencia(raio));

        // 6. Média dos números (10, 20, 30, 40, 50)
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Média dos números: " + media(numeros));

        // 7. Área do losango (diagonais 10 e 9)
        double diagonalMaior = 10, diagonalMenor = 9;
        System.out.println("Área do losango: " + areaLosango(diagonalMaior, diagonalMenor));

        // 8. Área do triângulo (base = 15, altura = 50)
        int baseT = 15, alturaT = 50;
        System.out.println("Área do triângulo: " + areaTriangulo(baseT, alturaT));

        // 9. Área do quadrado (lado = 5)
        int ladoQuadrado = 5;
        System.out.println("Área do quadrado: " + areaQuadrado(ladoQuadrado));

        // 10. Área do retângulo (base = 7, altura = 4)
        int baseR = 7, alturaR = 4;
        System.out.println("Área do retângulo: " + areaRetangulo(baseR, alturaR));
    }

    // Os métodos ficam AQUI FORA do main:

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static double areaCircunferencia(double raio) {
        double pi = 3.14;
        return pi * raio * raio;
    }

    public static doube media(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return (double) soma / numeros.length;
    }

    public static double areaLosango(double dMaior, double dMenor) {
        return (dMaior * dMenor) / 2;
    }

    public static int areaTriangulo(int base, int altura) {
        return (base * altura) / 2;
    }

    public static int areaQuadrado(int lado) {
        return lado * lado;
    }

    public static int areaRetangulo(int base, int altura) {
        return base * altura;
    }
}
