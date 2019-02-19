import java.util.Comparator;

public class Problem_18_7 {

    public static <K> void merge(K[] in, K[] out, Comparator<K> comp, int start, int inc) {

        int end_1 = Math.min(start + inc, in.length);
        int end_2 = Math.min(start + 2 * inc, in.length);
        int x = start;
        int y = start + inc;
        int z = start;

        while (x < end_1 && y < end_2)
            if (comp.compare(in[x], in[y]) < 0)
                out[z++] = in[x++];
            else
                out[z++] = in[y++];

        if (x < end_1)
            System.arraycopy(in, x, out, z, end_1 - x);
        else if (y < end_2)
            System.arraycopy(in, y, out, z, end_2 - y);
    }

    public static <K> void mergeSortBottomUp(K[] orig, Comparator<K> comp) {

        int n = orig.length;
        K[] source = orig;
        K[] destination = (K[]) new Object[n];
        K[] temp;
        for (int i = 1; i < n; i *= 2) {

            for (int j = 0; j < n; j += 2 * i)
                merge(source, destination, comp, j, i);

            temp = source;
            source = destination;
            destination = temp;
        }
        if (orig != source)
            System.arraycopy(source, 0, orig, 0, n);
    }

    private static class IntComparator<T extends Comparable<T>> implements Comparator<T> {
        public int compare(T a, T b) {
            return a.compareTo(b);
        }
    }

    public static void main(String[] args) {

        Integer[] inputArray = {12, 34, 0, 291, 3, 9, 25, 50};

        System.out.println("Before sorting integer array with generic mergesort ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }

        mergeSortBottomUp(inputArray, new IntComparator<Integer>());

        System.out.println("\nAfter sorting integer array with generic mergesort ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }

        String[] values = {"hey", "lol", "cat", "dog", "dad"};

        System.out.println("\n\nBefore sorting String array with generic mergesort ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        mergeSortBottomUp(values, new IntComparator<String>());

        System.out.println("\nAfter sorting String array with generic mergesort ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

    }

}


//Generic implementation of mergesort - can be used for integers or strings (in arrays)