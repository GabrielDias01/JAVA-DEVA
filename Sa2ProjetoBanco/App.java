package Sa2ProjetoBanco;

import javax.swing.JOptionPane;

import Sa2ProjetoBanco.Conta.ContaPF;
import Sa2ProjetoBanco.Conta.ContaPJ;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        // criar os vetores de objetos
        ContaPF contasPf[] = new ContaPF[10];
        ContaPJ contasPj[] = new ContaPJ[10];
        // criar a aplicação do banco
        boolean aberta = true;
        int contPF = 0;
        int contaAtual = 0;
        while (aberta) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha ação desejada:"
                            + "\n 1-Abrir Conta"
                            + "\n 2-Acessar Conta"
                            + "\n 3-Sair"));
            if (acao == 1) {
                int decisao = Integer.parseInt(JOptionPane.showInputDialog(
                        "Qual conta deseja Criar:"
                        + "\n 1-Conta Pessoal"
                        + "\n 2-Conta Juridica"));
                // criar a conta
                // instanciar o objeto
                if(decisao==1){
                    contasPf[contPF] = new ContaPF();// objeto criado
                    // preencher as informações da conta
                    contasPf[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                    contasPf[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                    contasPf[contPF].setSaldo(0);
                    contasPf[contPF].setnConta(1000 + contPF);
                    contPF++;
                    if(decisao==2){
                    contasPj[contPJ] = new ContaPJ();// objeto criado
                    // preencher as informações da conta
                    contasPj[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                    contasPj[contPJ].setnCnpj(null);(JOptionPane.showInputDialog("Informe o CNPJ:"));
                    contasPj[contPJ].setSaldo(0);
                    contasPj[contPJ].setnConta(2000 + contPJ);
                    contPJ++;
                }
            }
        }

    }
}
} } else if (acao == 2) {// buscar a conta já criada da PF
                for (int i = 0; i < contasPf.length; i++) {
                    // busca pelo nº da conta
                    int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                    if (nContaBusca == contasPf[i].getnConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                    } else {
                        JOptionPane.showMessageDialog(null, "Conta Não Encontrada");
                    }
                }
                boolean acessar = true;
                while (acessar) {
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Ação desejada:"
                            + "\n 1- verificar saldo"
                            + "\n 2-Saque"));
                }
            }
