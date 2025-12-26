package task2;

import java.util.Arrays;

public class FilterArray {
    public static <T> T[] filter(T[] array, Filter<T> filter) {
        T[] res = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            res[i] = filter.apply(res[i]);
        }
        return res;
    }
}
