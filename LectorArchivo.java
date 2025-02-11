import java.io.*;
import java.util.*;

public class LectorArchivo {
    public static int[] leerDesdeArchivo(String nombreArchivo) {
        List<Integer> lista = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(nombreArchivo))) {
            while (scanner.hasNextInt()) {
                lista.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo.");
        }
        return lista.stream().mapToInt(i -> i).toArray();
    }
}