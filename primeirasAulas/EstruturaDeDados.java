package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Samuel");
        nomes.add("Júlia");
        nomes.add("Mono");

        //System.out.println(nomes.get(0));
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.forEach(nome -> System.out.println(nome));
    }
}
