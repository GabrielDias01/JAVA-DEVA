package Exercicios;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercios1() {
        // vetor 5 nº, soma, multiplicação, numeros
        double vetor[]= new double[5];
        // preencher o vetor de 5 posiçoes
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor["+i+"]=");
            vetor[i]=sc.nextDouble();
            // realizar as operaoes 
            double soma=0;
            double multi=1;
            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i];
                multi += vetor[i];
            }
            System.out.println("o valor da soma entre os elementos é" +soma);
            System.out.println(" o valor da multiplicaçao entre os elementos é"+multi);
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Vetor["+i+"]="+vetor[i]);
                
            }
        }
    }
    public void exercicio2() {
        //ler idade e altura de 5 pessoas e imprimir na ordem inversa
        // criar os vetores para receber as informaçoes
        int idade[]= new int[5];
        double altura[]= new double[5];
        //preencher os vetores
        for (int i = 0; i < altura.length; i++) {
            System.out.println("Informe a idade da pessoa"+(i+1)+":");
            idade[i]=sc.nextInt();
            System.out.println("Informe a altura da pessoa"+(i+1)+":");
            altura[i]=sc.nextDouble();
            for (Double i = 4; i>=0; i--) {
                System.out.println("Informacoes da Pessoa"+(i+1)+":");
                System.out.println("Idade:"+idade[i]);
                System.out.println("Altura:"+altura[i]);
            }
        }
    }
    public void exercicio3() {
        // ler um vetor de 10 elementos e calcular a soma dos quadrados
        int vetor[]= new int[]{1,2,3,4,5,6,7,8,9,10};
        // calcular a soma dos quadrados
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i]*vetor[i];
        
        }
        System.out.println("a soma do quadrado dos elementos do vetor é:"+soma);
        
    }
}