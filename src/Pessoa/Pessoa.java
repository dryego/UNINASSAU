package Pessoa;

public class Pessoa {

    String nome;
    String sobrenome;
    String dataNascimento;
    String email;
    String telefone;
    String cpf;
    String nacionalidade;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public  void andar(){
        System.out.println("Andando...");
    }
    public  void correr(){
        System.out.println("Correndo...");
    }

    public  void comer(){
        System.out.println("Comendo...");
    }

    public  void dormir(){
        System.out.println("Dormindo, ZZZZ...");
    }
}









