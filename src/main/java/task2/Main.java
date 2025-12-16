package task2;


public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Integer[] filter = FilterArray.filter(arr, (a) -> {
            if (a == 1){
                return a;
            }
            return 0;
        });
        for (Integer integer : filter) {
            System.out.print(integer);
        }
    }
}




