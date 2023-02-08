package Calcularviagem;

public class Calcularviagem {
    public static void main(String[] args) {
        // obter distancia da viagem
        int distanciaPercorrida = 148;
        // valor de km em itros
        int kmemlitros = 11;
        // custo da gasolina
        int custodagasolina = 5;
        float custoviagem = distanciaPercorrida/kmemlitros;
        float reais = custoviagem*custodagasolina;
        // o custo foi de:
        System.out.println("o valor da viagem foi: "+reais+ "R$");


    }

}
