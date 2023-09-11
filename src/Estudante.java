//classe com atributos, getters e setters
public class Estudante {

    //construtor vazio
    public Estudante(){}

    //construtor completo
    public Estudante(String matricula, String nome, String email, String telefone, String endereco){
    this.matricula = matricula;
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.endereco = endereco;
    }
    private String matricula;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;


    public String obterMatricula(){
        return matricula;
    }
    public String obterNome(){
        return nome;
    }
    public String obterEmail(){
        return email;
    }

    public String obterTelefone(){
        return telefone;
    };

    public String obterEndereco(){
        return endereco;
    };

    public void alterarMatricula(String matricula){
        this.matricula = matricula;
    }
    public void alterarNome(String nome){
        this.nome = nome;
    }
    public void alterarEmail(String email){
        this.email = email;
    }
    public void alterarTelefone(String telefone){
        this.telefone = telefone;
    }
    public void alterarEndereco(String endereco){
        this.endereco = endereco;
    }

}
