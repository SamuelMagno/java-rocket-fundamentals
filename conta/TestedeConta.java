package conta;

public class TestedeConta {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();

        c1.setTitular( "Samuel");
        c1.setNumero("1234");

        c1.Depositar(200);
        c1.Sacar(100);
    }
}
