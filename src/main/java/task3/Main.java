package task3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = "s" + i;
        }
        array[0] = "s1";
        Map<String, Integer> map = returnElementAndCount(array);
        System.out.println("Key: " + map.keySet() + "\nCount: " + map.values());
    }
    public static <T> Map<T,Integer> returnElementAndCount(T[] array){
        Map<T,Integer> map = new HashMap<>();
        for (T t:array){
            map.put(t,map.getOrDefault(t,0) + 1);
        }
        return map;
    }
}

