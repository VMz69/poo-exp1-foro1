/* Para mantenerlo simple, Collection es una interfaz. Es como el padre de:
* set, list y queue. No se puede instanciar collection solo. No funciona de forma independiente.
* Set, List y Queue son sub-interfaces de Collection.
* En este ejemplo les explico que es Collection, una forma de guardar objetos o grupos de objetos
* juntos para despues poder ordenarlos, limitar cuantos caben, buscarlos, agregar o quitar mas,
* entre otros. Collection es el concepto general a muy alto nivel, pensemos en que es una caja.
* Pero dentro de collection hay tres subinterfaces, que podriamos definirlo tipo: la forma en que la caja
* esta organizada internamente, o un conjunto de reglas de como se guardan elementos en esa caja,
* cuantos, e incluso de que tipo! Si van en orden, en desorden, etc. */

/* En este caso, como parte de collections veremos rapidamente Set. Pensemos en set como que,
* la caja que menciono en el comment de arriba es una caja con elementos unicos, no se permiten
* duplicados. Si en mi caja guardo frutas, solo puedo tener 1 banana, 1 tomate, 1 manzana. No puedo tener
* dos iguales. Tambien puedo escoger: si me interesa el orden en el que agregue las frutas (linked hash set),
* si no me interesa (hash set), o si mejor las ordeno al estar todas ya en la caja (tree set). */

import java.util.HashSet;
import java.util.Set;

public class CollectionDemoQueue {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();

        System.out.println("Metiendo las frutas a la caja...");
        // Meto las frutas a la caja

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Banana"); // duplicado intencional :)

        System.out.println("Todas las frutas estan en la caja :)");

        System.out.println("Revisemos si hay peras en la caja!");
        // Luego consultamos: veamos si existe la pera.
        if (frutas.contains("Pera")) {
            System.out.println("Pera está en el set");
        }
System.out.println("En este momento veremos TODAS las frutas.");
        // Como recorrer todas las frutas de la caja, y ver que los duplicados fueron ignored:
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
