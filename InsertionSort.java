public class InsertionSort implements AlgoritmosOrdenamiento {
    public void ordenar(int[] datos) {
        for (int i = 1; i < datos.length; i++) {
            int clave = datos[i];
            int j = i - 1;
            while (j >= 0 && datos[j] > clave) {
                datos[j + 1] = datos[j];
                j--;
            }
            datos[j + 1] = clave;
        }
    }
}