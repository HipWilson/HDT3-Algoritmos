public class MedirTiempo {
    public static void medir(Ordenamiento algoritmo, int[] datos, String nombre) {
        int[] copia = datos.clone();
        long inicio = System.nanoTime();
        algoritmo.ordenar(copia);
        long fin = System.nanoTime();
        System.out.println(nombre + " tomó " + (fin - inicio) / 1e6 + " ms.");
    }
}