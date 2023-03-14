package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);
    public void letra(){
        System.out.println("Informe uma letra:");
        String letraDigitada = sc.nextLine();
        switch(letraDigitada){
            case "a": System.out.println(letraDigitada+ " É vogal " );
            break;
            case "e": System.out.println(letraDigitada+ " É vogal " );
            break;
            case "i": System.out.println(letraDigitada+ " É vogal " );
            break;
            case "o": System.out.println(letraDigitada+ " É vogal " );
            break;
            case "u": System.out.println(letraDigitada+ " É vogal " );
            break;
            default:System.out.println(letraDigitada+ " É consoante " );
            break;
        }
    }

    public void mes() {
        System.out.println("Informe um numero:");
        int mesDigitado = sc.nextInt();
        switch(mesDigitado){
            case 1: System.out.println(mesDigitado+ " É Janeiro " );
            break;
            case 2: System.out.println(mesDigitado+ " É Fevereiro " );
            break;
            case 3: System.out.println(mesDigitado+ " É Março " );
            break;
            case 4: System.out.println(mesDigitado+ " É Abril " );
            break;
            case 5: System.out.println(mesDigitado+ " É Maio " );
            break;
            case 6: System.out.println(mesDigitado+ " É Junho " );
            break;
            case 7: System.out.println(mesDigitado+ " É Julho " );
            break;
            case 8: System.out.println(mesDigitado+ " É Agosto " );
            break;
            case 9: System.out.println(mesDigitado+ " É Setembro " );
            break;
            case 10: System.out.println(mesDigitado+ " É Outubro " );
            break;
            case 11: System.out.println(mesDigitado+ " É Novembro " );
            break;
            case 12: System.out.println(mesDigitado+ " É Dezembro " );
            break;
            default: System.out.println(mesDigitado+ " Não Encontrado ");
            break;
            
            
        }


        }
        
    }

