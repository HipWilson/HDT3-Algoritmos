public class QuickSort implements Ordenamiento {
    public void ordenar(int[] datos) {
        quicksort(datos, 0, datos.length - 1);
    }

    private void quicksort(int[] datos, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int pivote = particion(datos, izquierda, derecha);
            quicksort(datos, izquierda, pivote - 1);
            quicksort(datos, pivote + 1, derecha);
        }
    }

    private int particion(int[] datos, int izquierda, int derecha) {
        int pivote = datos[derecha];
        int i = izquierda - 1;
        for (int j = izquierda; j < derecha; j++) {
            if (datos[j] < pivote) {
                i++;
                int temp = datos[i];
                datos[i] = datos[j];
                datos[j] = temp;
            }
        }
        int temp = datos[i + 1];
        datos[i + 1] = datos[derecha];
        datos[derecha] = temp;
        return i + 1;
    }
}