import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> tiendaropa = new HashMap<>();

        tiendaropa.put("Tienda1", "Pantalones");
        tiendaropa.put("Tienda2", "Camisas");
        tiendaropa.put("Tienda3", "zapatos");

        System.out.println("Productos en tiendas:"+tiendaropa);

        tiendaropa.put("Tienda4", "juguetes");

        System.out.println("Productos en tiendas:"+tiendaropa);

        tiendaropa.remove("Tienda2");

        System.out.println("Productos en tiendas:"+tiendaropa);


    }
}
