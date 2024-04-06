package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa p2 = new Pessoa();

        p2.setCpf("43256790832");
        p2.setIdade(26);
        p2.setNome("Samuel");
        System.out.println(p2.imprimirDados());

        Professor p3 = new Professor();
        //Pessoa p4 = new Professor(); Forma válida

        p3.setCpf("12345678911");
        p3.setIdade(30);
        p3.setNome("João");
        p3.setSalario(2000);
        System.out.println(p3.imprimirDados());

        Aluno p5 = new Aluno();
        //Pessoa p4 = new Professor(); Forma válida

        p5.setCpf("98765432110");
        p5.setIdade(21);
        p5.setNome("José");
        p5.setMatricula("abc98");
        System.out.println(p5.imprimirDados());
    }
}
