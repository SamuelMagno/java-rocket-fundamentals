package excecoes;

public class Excecoes {
    
    //checked exception

    //unchecked exception - runtime

    public static void main(String[] args) {
        try {
            validaNumero(19);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validaNumero(int numero) throws Exception {
        if (numero < 100) {
            throw new Exception("Número menor que 100");
        }
    }
}
