import java.util.Arrays;

public class MergeSort implements AlgoritmosOrdenamiento {
    public void ordenar(int[] datos) {
        ordenar(datos, 0, datos.length - 1);
    }

    private void ordenar(int[] datos, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            ordenar(datos, izquierda, medio);
            ordenar(datos, medio + 1, derecha);
            combinar(datos, izquierda, medio, derecha);
        }
    }

    private void combinar(int[] datos, int izquierda, int medio, int derecha) {
        int[] temp = Arrays.copyOfRange(datos, izquierda, derecha + 1);
        int i = 0, j = medio - izquierda + 1, k = izquierda;

        while (i <= medio - izquierda && j < temp.length) {
            if (temp[i] <= temp[j]) {
                datos[k++] = temp[i++];
            } else {
                datos[k++] = temp[j++];
            }
        }

        while (i <= medio - izquierda) {
            datos[k++] = temp[i++];
        }
    }
}

