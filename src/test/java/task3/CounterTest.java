package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static task3.Main.returnElementAndCount;


class CounterTest {

    String[] array = new String[10];
    Map<String, Integer> map;

    @BeforeEach
    public void setUp() {
        for (int i = 0; i < array.length; i++) {
            array[i] = "s" + i;
        }
        array[1] = "s4";
        map = returnElementAndCount(array);
    }

    @Test
    public void testCounter() {
        assertEquals(2,map.get("s4"));
    }
}