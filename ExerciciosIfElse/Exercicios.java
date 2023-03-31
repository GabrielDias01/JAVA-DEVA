package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o Primeiro Valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o Segundo Valor:");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O maior valor é " + valor1);
        } else {
            System.out.println("O maior valor é " + valor2);

        }
    }

    public void exercicio2() {
        System.out.println("Informe seu ano de nascimento");
        int idade = sc.nextInt();
        if (idade <= 2007) {
System.out.println("Sua idade condiz com a regra");
        }else {
            System.out.println("Sua idade nao é permitida para votar");

    }
}

public void exercicio3() {
    System.out.println("Digite a Senha:");
        int senha = sc.nextInt();
        if (senha == 1234) {
System.out.println("Acesso Permitido");
        }else {
            System.out.println("Acesso Negado");

    
}
}
public void exercicio4() {
    System.out.println("Infome a quantidade de Maças");
    double maca = sc.nextDouble();
    double valorMaca = 0.30;
    double valorCompra;
    if(maca <12) {
        valorCompra = valorMaca*maca;
    }else{
        valorMaca = 0.25;
        valorCompra = valorMaca*maca;
    
    }
    System.out.println("Valor da compra é: R$" +valorCompra);
}
public void exercicio5() {
    System.out.println("Informe o primeiro numero");
    int a = sc.nextInt();
    System.out.println("Informe o segundo numero");
    int b = sc.nextInt();
    System.out.println("Infome o terceiro numero");
    int c = sc.nextInt();
    if(a<b&&b<c) {
    System.out.println("Numero Digitados na ordem:" +a+b+c);
    }else if (a<c&&c<b) {
    System.out.println("Numero Digitados na ordem:" +a+c+b);
    }else if (b<a&&a<c) {
        System.out.println("Numero Digitados na ordem:" +b+a+c);
    }else if(b<c&&c<a) {
        System.out.println("Numero Digitados na ordem:" +b+c+a);
    }else if (c<a&&a<b) {
        System.out.println("Numero Digitados na ordem:" +c+a+b);
    }else if (c<b&&b<a) {
        System.out.println("Numero Digitados na ordem:" +c+b+a);
        
    }else System.out.println("Não use numeros repetidos");
    

    }
    public void exercicio6() {

        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();
        System.out.println("Digite 2 Para masculino, 1 Feminino");
        double sexo = sc.nextDouble();
        double pesoIdeal;
        if (sexo==1){
            pesoIdeal = 62.1*altura-44.7;
        }else{
            pesoIdeal = 72.7*altura-58;
        }
         System.out.println("O peso ideal em kg é" +pesoIdeal);



}

}

    


