import java.util.Random;
import java.util.Scanner;

public class AtividadeFormativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        System.out.println("Informe o Nº de colunas");
        int coluna = sc.nextInt();
        System.out.println("Informe o Nº de linhas");
        int linha = sc.nextInt();
        int matriz[][] = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = rd.nextInt(9);
            }

        }
        for (int i = 0; i < linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");

        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }

            }

        }
        System.out.println(" ");
        for (int i = 0; i < linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");

        }
    }

    public void exercicio2() {
        int nSorteado = rd.nextInt(1000);
        int nDigitado;
        System.out.println("Informe um Nº:");
        nDigitado = sc.nextInt();
        int contador = 1;
        while (nSorteado != nDigitado) {
            if (nDigitado > nSorteado) {
                System.out.println("O numero digitado é MAIOR que o Sortedo.");
                System.out.println("Digite um novo Nº");
                nDigitado = sc.nextInt();
            } else if (nDigitado < nSorteado) {
                System.out.println("O numero digitado é MENOR que o Sorteado. ");
                System.out.println("Digite um novo Nº");
                nDigitado = sc.nextInt();
            } else {
                System.out.println("Você acertou, o Numero certo era" + nSorteado);
            }
            contador++;
        }
        System.out.println("Você acertou em " + contador + "Tentativas");
    }

    public void exercicio3() {
        int tamanhoVetor =rd.nextInt(1000);
        int vetor []= new int [tamanhoVetor];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]=rd.nextInt(100)+1;
        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==0){
                System.out.println(vetor[i]);
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==1){
                System.out.println(vetor[i]);
            }
        }
    }
}
