package task2;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        Integer[] arr = new Integer[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//        Integer[] filter = FilterArray.filter(arr, (a) -> {
//            if (a == 1){
//                return a;
//            }
//            return 0;
//        });
//        for (Integer integer : filter) {
//            System.out.print(integer);
//        }
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        array[0] = 2;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    counter++;
                    System.out.println(counter);
                }
            }
        }
    }
}




