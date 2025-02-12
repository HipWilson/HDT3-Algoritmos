import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class OrdenamientoTest {

    @Test
    void testBucketSort() {
        int[] datos = {29, 10, 14, 37, 14};
        int[] esperado = {10, 14, 14, 29, 37};
        BucketSort bucketSort = new BucketSort();
        bucketSort.ordenar(datos);
        assertArrayEquals(esperado, datos);
    }

    @Test
    void testInsertionSort() {
        int[] datos = {5, 3, 8, 6, 2};
        int[] esperado = {2, 3, 5, 6, 8};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.ordenar(datos);
        assertArrayEquals(esperado, datos);
    }

    @Test
    void testMergeSort() {
        int[] datos = {12, 11, 13, 5, 6, 7};
        int[] esperado = {5, 6, 7, 11, 12, 13};
        MergeSort mergeSort = new MergeSort();
        mergeSort.ordenar(datos);
        assertArrayEquals(esperado, datos);
    }

    @Test
    void testQuickSort() {
        int[] datos = {10, 7, 8, 9, 1, 5};
        int[] esperado = {1, 5, 7, 8, 9, 10};
        QuickSort quickSort = new QuickSort();
        quickSort.ordenar(datos);
        assertArrayEquals(esperado, datos);
    }

    @Test
    void testRadixSort() {
        int[] datos = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] esperado = {2, 24, 45, 66, 75, 90, 170, 802};
        RadixSort radixSort = new RadixSort();
        radixSort.ordenar(datos);
        assertArrayEquals(esperado, datos);
    }

    @Test
    void testGeneradorNumeros() {
        int[] datos = GeneradorNumeros.generarNumerosAleatorios(5, 100);
        assertEquals(5, datos.length);
    }

    @Test
    void testLectorArchivo() {
        int[] datos = {3, 1, 4, 1, 5};
        String nombreArchivo = "test_numeros.txt";
        GeneradorNumeros.guardarEnArchivo(datos, nombreArchivo);
        int[] leidos = LectorArchivo.leerDesdeArchivo(nombreArchivo);
        assertArrayEquals(datos, leidos);
    }
}
