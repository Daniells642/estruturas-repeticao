package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 4;
        int notas[] = new int[n];
        int i;
        // Entrada de Dados
        for (i = 0; i < n; i++) {
            System.out.println("Digite suas notas: ");
            notas[i] = scan.nextInt();
        }

        // Processamento: somar todos os valores, definir o maior e o menor valor
        int soma = 0;
        int menor = notas[0]; // notas[0] = 1o. valor armazenador no vetor "notas"
        int maior = notas[0];

        for (i = 0; i < n; i++) {
            soma = soma + notas[i];

            if (notas[i] < menor)
                menor = notas[i];

            if (notas[i] > maior)
                maior = notas[i];
        }

        // Saída (resultados)

        System.out.println("");
        for (i = 0; i < n; i++) {

            if (notas[i] == menor)
                System.out.printf("notas[%d] = %2d <--- menor valor\n", i, notas[i]);

            else if (notas[i] == maior)
                System.out.printf("notas[%d] = %2d <--- maior valor\n", i, notas[i]);

            else System.out.printf("notas[%d] = %2d\n", i, notas[i]);
        }

        int media = soma / n;

        System.out.printf("\nSoma = %d\n", soma);
        System.out.printf("\nMédia = %d\n", media);
    }
}




          /*


        System.out.println("Digite a primeira nota: ");
        numeros[0] = scan.nextInt();

        System.out.println("Digite a 2 nota: ");
        numeros[1] = scan.nextInt();

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }



        System.out.println("Digite a 3 nota: ");
        numeros = new int[]{scan.nextInt()};

        System.out.println("Digite a 4 nota: ");
        numeros = new int[]{scan.nextInt()};

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        */

