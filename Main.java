import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = GeneradorNumeros.generarNumerosAleatorios(10, 10000);
        GeneradorNumeros.guardarEnArchivo(numeros, "numeros.txt");

        int[] datos = LectorArchivo.leerDesdeArchivo("numeros.txt");
       
        System.out.println("Ordenando con diferentes algoritmos...");

        MedirTiempo.medir(new InsertionSort(), datos, "Insertion Sort");
        MedirTiempo.medir(new MergeSort(), datos, "Merge Sort");
        MedirTiempo.medir(new QuickSort(), datos, "Quick Sort");
        MedirTiempo.medir(new RadixSort(), datos, "Radix Sort");
        MedirTiempo.medir(new BucketSort(), datos, "Bucket Sort");
    }
}