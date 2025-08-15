import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> estudiantes = new HashMap<>();
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("\nMenu:");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");

            int opcion = input.nextInt();
            input.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el carnet del alumno: ");
                    String carnet = input.nextLine();
                    System.out.println("Ingrese el nombre completo del alumno: ");
                    String nombre = input.nextLine();

                    estudiantes.put(carnet, nombre);
                    System.out.println("Alumno ingresado exitosamente!");
                    break;
                case 2:
                    System.out.println("Ingrese el carnet del alumno a buscar: ");
                    carnet = input.nextLine();
                    if(estudiantes.containsKey(carnet)){
                        System.out.println("Alumno encontrado: " + estudiantes.get(carnet));
                    }
                    else {
                        System.out.println("Alumno no encontrado! No se puede mostrar.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el carnet del alumno a eliminar: ");
                    carnet = input.nextLine();
                    if(estudiantes.containsKey(carnet)){
                        estudiantes.remove(carnet);
                        System.out.println("Alumno eliminado exitosamente!");
                    }
                    else {
                        System.out.println("Alumno no encontrado! No se puede eliminar.");
                    }
                    break;
                case 4:
                    if(estudiantes.isEmpty()){
                        System.out.println("No hay alumnos registrados!");
                    }
                    else {
                        System.out.println("Lista de alumnos: ");
                        for(Map.Entry<String, String> alumno: estudiantes.entrySet()){
                            System.out.println("Carnet: " + alumno.getKey() + ", Nombre: " + alumno.getValue());
                        }
                    }
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida!");
            }
        }
    }
}
