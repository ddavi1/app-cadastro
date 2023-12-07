package pessoagov;

import javax.sound.midi.SysexMessage;

public class CadastroPessoas {

    private String nome;
    private int idade;
    private long cpf;
    private String email;

    public String cadastrarCpf() {
        return "cpf cadastrado com sucesso";
    }

    public String cadastrarIdade() {
        return "idade cadastrada com sucesso";
    }

    public String cadastrarEmail() {
        return "email cadastrado com sucesso";
    }

    public String getNome() {
        if (nome == "") {
        return "Erro ao cadastrar";
        } else {
            return "Nome cadastrado: " +nome;
        }
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <=130) {
            System.out.println("Idade cadastrada: " + idade);
            this.idade = idade;
        } else {
            System.out.println("Erro ao cadastrar idade");
        }

    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        String cpfValidador = String.valueOf(cpf);
        if (cpfValidador.length() >=12) {
            System.out.println( "ERRO ao criar: CPF deve ter 11 dígitos");
        } else {
            System.out.println( "Cpf cadastrado: " + cpf);
            this.cpf = cpf;
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        int validarEmail = email.indexOf("@");
        if (validarEmail != -1) {
            System.out.println("Email cadastrado: " + email);
            this.email = email;
        } else {
            System.out.println("Erro ao cadastrar email");
        }

    }
}
