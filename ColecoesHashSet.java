import java.util.HashSet;
import java.util.Set;

public class ColecoesHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);
        
        numeros.remove(12);

        int total = numeros.size();
        System.out.println(total);

        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        System.out.println(numeros.contains(13));

    }
}
