import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Samuel", 8);
        notas.put("Júlia", 9);
        notas.put("Mono", 10);

        int nota = notas.get("Mono");
        System.out.println(nota);

        for (Map.Entry<String, Integer> entry :notas.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
