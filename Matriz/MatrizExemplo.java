package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // Criar uma matriz 10X9, preencher, imprimir e manipular
        // Declarar matriz
        int matriz[][] = new int[10][9];
        // Preencher a minha matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }

        // Imprimir a matriz
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 9; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]="
                        + matriz[i][j]);
            }

        }
        // Imprimir em formato de matriz
        for (int i = 0; i < 10; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        // SOMA DA 4ºLINHA
        int somaLinha = 0;
        for (int i = 0; i < 9; i++) {
            somaLinha += matriz[3][i];
        }
        System.out.println("+++++++++");
        System.out.println("Soma da 4ºLinha é" + somaLinha);
        // SOMA DA 4º COLUNA
        int somaColuna = 0;
        for (int i = 0; i < 10; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println("+++++++++");
        System.out.println("Soma da 4º Coluna é" + somaColuna);

    }

    public void exemplo2() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < 5; i++) {
            System.out.print("| ");
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}
