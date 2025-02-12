import java.util.*;

public class BucketSort implements Ordenamiento {
    public void ordenar(int[] datos) {
        int max = Arrays.stream(datos).max().getAsInt();
        List<Integer>[] buckets = new List[max / 10 + 1];

        for (int num : datos) {
            int index = num / 10;
            if (buckets[index] == null) buckets[index] = new ArrayList<>();
            buckets[index].add(num);
        }

        int i = 0;
        for (List<Integer> bucket : buckets) {
            if (bucket != null) {
                Collections.sort(bucket);
                for (int num : bucket) {
                    datos[i++] = num;
                }
            }
        }
    }   
}