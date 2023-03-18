package VetoresArrays;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // Criar meu vetor
        double[] valores = new double[] { 10.5, 15.8, 7.5, -17.6 };
        System.out.println("O 1º elemento do vetor - valores[0] é" + valores[0]);
        System.out.println("O 2º elemento do vetor - valores[1] é" + valores[1]);
        System.out.println("O 3º elemento do vetor - valores[2] é" + valores[2]);
        System.out.println("O 4º elemento do vetor - valores[3] é" + valores[3]);
        System.out.println("Digite um novo valor para a 4º posição/índice 3");
        valores[3] = sc.nextDouble();
        System.out.println("O Novo valor da 4ºPosição/Índice é" + valores[3]);

    }

    public void exemplo2() {
        // Criar um vetor (Vazio)
        int valoresint[] = new int[5];
        System.out.println("Digite 5 valores Inteiros");
        valoresint[0] = sc.nextInt();
        valoresint[1] = sc.nextInt();
        valoresint[2] = sc.nextInt();
        valoresint[3] = sc.nextInt();
        valoresint[4] = sc.nextInt();
        System.out.println("O 1º elemento do vetor - índice[0] é" + valoresint[0]);
        System.out.println("O 2º elemento do vetor - índice[1] é" + valoresint[1]);
        System.out.println("O 3º elemento do vetor - índice[2] é" + valoresint[2]);
        System.out.println("O 4º elemento do vetor - índice[3] é" + valoresint[3]);
        System.out.println("O 5º elemento do vetor - índice[4] é" + valoresint[4]);

    }

    public void exemplo3() {
        // Criar um vetor
        double valoresdouble[] = new double[10];
        System.out.println("Digite 10 valores Reais");
        valoresdouble[0] = sc.nextDouble();
        valoresdouble[1] = sc.nextDouble();
        valoresdouble[2] = sc.nextDouble();
        valoresdouble[3] = sc.nextDouble();
        valoresdouble[4] = sc.nextDouble();
        valoresdouble[5] = sc.nextDouble();
        valoresdouble[6] = sc.nextDouble();
        valoresdouble[7] = sc.nextDouble();
        valoresdouble[8] = sc.nextDouble();
        valoresdouble[9] = sc.nextDouble();
        System.out.println("O 1º elemento do vetor - índice[9] é" + valoresdouble[9]);
        System.out.println("O 2º elemento do vetor - índice[8] é" + valoresdouble[8]);
        System.out.println("O 3º elemento do vetor - índice[7] é" + valoresdouble[7]);
        System.out.println("O 4º elemento do vetor - índice[6] é" + valoresdouble[6]);
        System.out.println("O 5º elemento do vetor - índice[5] é" + valoresdouble[5]);
        System.out.println("O 6º elemento do vetor - índice[4] é" + valoresdouble[4]);
        System.out.println("O 7º elemento do vetor - índice[3] é" + valoresdouble[3]);
        System.out.println("O 8º elemento do vetor - índice[2] é" + valoresdouble[2]);
        System.out.println("O 9º elemento do vetor - índice[1] é" + valoresdouble[1]);
        System.out.println("O 10º elemento do vetor - índice[0] é" + valoresdouble[0]);

    }

    public void exemplo4() {
        // Criar meu vetor
        double nota[] = new double[4];
        System.out.println("Digite 4 Notas");
        nota[0] = sc.nextDouble();
        nota[1] = sc.nextDouble();
        nota[2] = sc.nextDouble();
        nota[3] = sc.nextDouble();
        double media = (nota[0] + nota[1] + nota[2] + nota[3]) / 4;
        System.out.println("Sua média é " + media);

    }
}
