package veiculo;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando carro");
    }
    public void frear() {
        System.out.println("Freando carro");
    }
}
