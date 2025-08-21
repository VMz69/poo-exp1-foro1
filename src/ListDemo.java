import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        System.out.println("Lista: " + lista);


        String removido = lista.remove(0);
        System.out.println("Se eliminó (por índice 0): " + removido);
        System.out.println("Lista tras remover por índice: " + lista);
    }
}


