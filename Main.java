import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = GeneradorNumeros.generarNumerosAleatorios(10, 10000);
        GeneradorNumeros.guardarEnArchivo(numeros, "numeros.txt");

        int[] datos = LectorArchivo.leerDesdeArchivo("numeros.txt");
       
        System.out.println("Ordenando con diferentes algoritmos...");

        MedidorTiempo.medir(new InsertionSort(), datos, "Insertion Sort");
        MedidorTiempo.medir(new MergeSort(), datos, "Merge Sort");
        MedidorTiempo.medir(new QuickSort(), datos, "Quick Sort");
        MedidorTiempo.medir(new RadixSort(), datos, "Radix Sort");
        MedidorTiempo.medir(new BucketSort(), datos, "Bucket Sort");
    }
}