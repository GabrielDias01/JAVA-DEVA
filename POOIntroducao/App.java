package POOIntroducao;

public class App {
    public static void main(String[] args) {
        // criar 3 objetos ResgistraAluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();
        // set do nome usando o setNome()
        ana.setNome("Ana Machado");
        ana.setEndereco("Rua das Flores,123");
        ana.setIdade(20);
        ana.setNotaCiencias(9);
        ana.setNotaMatematica(8);
        ana.setNotaPortugues(5);

        beto.setNome("Roberto da Silva");
        beto.setEndereco("Rua das Flores,456");
        beto.setIdade(23);
        beto.setNotaCiencias(8);
        beto.setNotaMatematica(7);
        beto.setNotaPortugues(6);
        
        carlos.setNome("Carlos Alberto");
        carlos.setEndereco("Rua das Flores,789");
        carlos.setIdade(19);
        carlos.setNotaCiencias(6);
        carlos.setNotaMatematica(6);
        carlos.setNotaPortugues(10);
        // imprimi usando o método getNome()
        System.out.println(ana.getNome());
        System.out.println(ana.getEndereco());
        System.out.println(ana.getIdade());
        System.out.println(ana.getMedia());
        System.out.println("Contador: "
        + RegistraAluno.getQuantidadeAlunos());

        System.out.println(beto.getNome());
        System.out.println(beto.getEndereco());
        System.out.println(beto.getIdade());
        System.out.println("Contador: "
        + RegistraAluno.getQuantidadeAlunos());

        System.out.println(carlos.getNome());
        System.out.println(carlos.getEndereco());
        System.out.println(carlos.getIdade());
        System.out.println("Contador: "
        + RegistraAluno.getQuantidadeAlunos());
    }

}
