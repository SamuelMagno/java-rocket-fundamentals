package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.cpf = "33344455578";
        pessoa1.nome = "Samuel";
        pessoa1.idade = 26;

        System.out.println(pessoa1.cpf);
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);

        Pessoa p2 = new Pessoa();

        p2.cpf = "43256790832";
        p2.idade = 28;
        p2.nome = "Julia";
        System.out.println(p2.imprimirDados());
    }
}
