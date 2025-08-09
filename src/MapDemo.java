import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("clave1", "valor1");
        mapa.put("clave2", "valor2");
        System.out.println("Mapa: " + mapa);
    }
}
