package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("O nº da interação é" + i);
        }
    }

    public void exemplo2() {
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor[" + i + "]=");
            vetor[i] = sc.nextInt();
        }
        // imprimir o vetor na ordem inversa
        for (int i = 9; i >= 0; i--) {
            System.out.println("Vetor[" + i + "]=" + vetor[i]);
        }
    }

    public void exemplo3() {
        // Carinho de Compra
        double carrinhoCompra[] = new double[] { 19.90, 35.70, 56.80, 97.50 };
        // Finalizar a Compra
        double valorFinal = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
        }
        // Mostrar o valor final da compra
        System.out.println("O valor da compra é R$" + valorFinal);
    }

    public void exemplo4() {
        // Ler 4 notas e mostrar as 4 notas e a média
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a Nota" + (i + 1) + ".");
            vetorNotas[i] = sc.nextDouble();
        }
        // Imprimir as 4 notas e formar a média
        double mediaNotas = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas += vetorNotas[i];
            System.out.println("A " + (i + 1) + "Nota é" + vetorNotas[i]);
        }
        mediaNotas /= vetorNotas.length;
        System.out.println("A média do aluno é" + mediaNotas);
    }

    public void exemplo5() {
        // Ler 4 notas de 10 alunos
        // Vetor para guardar as médias
        double vetorMedia[] = new double[10];
        // Preencher o valor das médias
        for (int i = 0; i < vetorMedia.length; i++) {
            double notas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota" + (j + 1) + "Aluno" + (i + 1) + ":");
                notas += sc.nextDouble();
            }
            notas /= 4;
            vetorMedia[i] = notas;
        }
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i] >= 7) {
                System.out.println("A média do aluno" + (i + 1) + "é" + vetorMedia[i]);
            }

        }

    }
    public void exemplo6() {
        String letras[] = new String[]{"a","b","c","d","e","f","g","h","i","j"};
            int contConsoante =0;
            for (int i = 0; i < letras.length; i++) {
                if(letras[i]=="a" ||letras[i]=="e" ||letras[i]=="i" ||letras[i]=="o" ||letras[i]=="u"){

                    System.out.println(letras[i]+"É vogal:");
            } else{
                System.out.println(letras+"É consoante");
                contConsoante++;
            }
        }
        System.out.println("O nº de consoante é"+contConsoante);
    }

    public void exemplo7() {
        System.out.println("Digite uma Palavra");
        String letras = sc.next();
        letras = letras.toLowerCase();
        int contConsoante=0;
        for (int i = 0; i < letras.length(); i++) {
            char c =letras.charAt(i);
           if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            System.out.println(c+"é vogal:");
            
           }else{
            System.out.println(c+"é consoante");
            contConsoante++;
           }
        }
        System.out.println("O nº de consoante é"+contConsoante);
    }
    public void exemplo8() {
        int numeros[]= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int contPar=0;
        int contImpar=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0) {
                contPar++;      
            }else{
                contImpar++;
            }
        }
        int nPar[]=new int [contPar];
        int nImpar[]=new int [contImpar];
        contImpar=0;
        contPar=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0) {
                nPar[contPar]= numeros[i];
                contPar++; 
            }else{
                nImpar[contImpar]= numeros[i];
                contImpar++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("VetorNumero["+i+"]="+numeros[i]);
        }
        for (int i = 0; i < nImpar.length; i++) {
            System.out.println("VetorImpar["+i+"]="+numeros[i]);
        }
        for (int i = 0; i < nPar.length; i++) {
            System.out.println("VetorPar["+i+"]="+numeros[i]);
        }
    }
}


