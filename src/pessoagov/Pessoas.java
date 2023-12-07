package pessoagov;


public class Pessoas {
    public static void main(String[] args) {

        CadastroPessoas cadastro = new CadastroPessoas();

        // cadastro de nome implementado

       cadastro.setNome("davi");
       System.out.println(cadastro.getNome());

        // cadastro idade
        cadastro.setIdade(20);
        cadastro.cadastrarIdade();

        // cadastro cpf
        cadastro.setCpf(00011122234512);
        //System.out.println(cadastro.cadastrarCpf());

        // cadastro email
        cadastro.setEmail("davigabriel324@gmail.com");

    }
}
