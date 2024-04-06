package pessoa;

public class Pessoa {
    String nome;
    int idade;
    String cpf;

    String imprimirDados(){
       return String.format("Nome: %s, Idade: %d, Documento: %s", nome, idade, cpf);
    }
}
