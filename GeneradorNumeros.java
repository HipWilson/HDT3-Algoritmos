import java.io.*;
import java.util.*;

public class GeneradorNumeros {
    public static int[] generarNumerosAleatorios(int cantidad, int max) {
        Random rand = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = rand.nextInt(max);
        }
        return numeros;
    }

    public static void guardarEnArchivo(int[] datos, String nombreArchivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            for (int num : datos) {
                writer.println(num);
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
    }
}