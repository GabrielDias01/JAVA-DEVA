package POOInterfaceExercicio2;

import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.Elements.Origin;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Random rd = new Random();
        
        Agenda contatos[] = new Agenda[10];
        for (int i = 0; i < contatos.length; i++) {
            contatos[i] = new Agenda();// construtor do objeto
            contatos[i].setNome(JOptionPane.showInputDialog("Nome"));
            contatos[i].setIdade(i+18);
            contatos[i].setAltura(rd.nextDouble(1,10));
        }
        String nomeBuscado = JOptionPane.showInputDialog("Infomre o nome Buscado");
        int cont=0;
        boolean procure = true;
        while(procure){
            if(nomeBuscado.equals(contatos[cont].getNome())){
                procure = false;
                JOptionPane.showMessageDialog(null,
                    "Idade: "+contatos[cont].getIdade()
                    +"\nAltura: "+contatos[cont].getAltura());
            }
            cont++;
        }
    }
}
