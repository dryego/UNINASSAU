import Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Dryego");
        pessoa.setSobrenome("Barbosa");
        pessoa.setDataNascimento("28/03/1988");
        pessoa.setEmail("dryego@email.com");
        pessoa.setTelefone("(81)99124.8860");
        pessoa.setCpf("123.123.123_23");
        pessoa.setNacionalidade("Brasileiro");

        System.out.println(pessoa.getNome()+" "+pessoa.getSobrenome());
        System.out.println(pessoa.getEmail() +" - "+ pessoa.getDataNascimento() +" - "+ pessoa.getTelefone());
        System.out.println(pessoa.getNacionalidade());

        pessoa.comer();
        pessoa.andar();
        pessoa.correr();
        pessoa.dormir();

    }
}