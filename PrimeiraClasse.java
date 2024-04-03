public class PrimeiraClasse {
    public static void main(String[] args) {
        int dadoInt = 1;
        double dadoDouble = 1.19;
        float dadoFloat = 3.14f;
        long dadoLong =  9223372036854775807L;
        String dadoTexto = "Agora vai";
        boolean dadoBool = true;

        if (dadoInt > 10) {
            System.out.println("primeiro if");
        } else if (dadoInt < 10) {
            System.out.println("Else if");
        } else {
            System.out.println("Else");
        }

        int i = 0;
        while(i < 3) {
            System.out.println("Valor inicial é " + i);
            i++;
        }

        for (int j = 0; j < 4; j++) {
            System.out.println("Valor do FOR é " + j);
        }
    }
}
