import java.util.Arrays;

public class RadixSort implements Ordenamiento {
    public void ordenar(int[] datos) {
        int max = Arrays.stream(datos).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            contarPorDigito(datos, exp);
        }
    }

    private void contarPorDigito(int[] datos, int exp) {
        int[] salida = new int[datos.length];
        int[] conteo = new int[10];

        for (int num : datos) {
            conteo[(num / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            conteo[i] += conteo[i - 1];
        }

        for (int i = datos.length - 1; i >= 0; i--) {
            salida[conteo[(datos[i] / exp) % 10] - 1] = datos[i];
            conteo[(datos[i] / exp) % 10]--;
        }

        System.arraycopy(salida, 0, datos, 0, datos.length);
    }
}