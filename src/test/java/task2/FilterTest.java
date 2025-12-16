package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class FilterTest {

    Integer[] arr = new Integer[10];

    @BeforeEach
    public void setUp() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    @Test
    public void testSizeArray() {
        assertEquals(10, arr.length);
    }

    @Test
    public void testFilterWhenTheNumbersIsEven() {
        Integer[] filter = FilterArray.filter(arr, (a) -> {
            if (a % 2 == 0) {
                return a;
            }
            return 0;
        });
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0) || (i % 2 != 0)) {
                assertEquals(0, (int) filter[i]);
            } else {
                assertEquals((int) filter[i], i);
            }
        }
    }
}