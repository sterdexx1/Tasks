package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringBuilderTest {

    @Test
    public void testCreateAndUndo(){
        StringBuilder stringBuilder = new StringBuilder();
        MyStringBuilder myStringBuilder = new MyStringBuilder(stringBuilder);
        stringBuilder.append("a");
        stringBuilder.append("b");
        Memory memory = myStringBuilder.createMemory();
        stringBuilder.append("c");
        MyStringBuilder myStringBuilder1 = myStringBuilder.undo(memory);
        assertEquals("abc",stringBuilder.toString());
        assertEquals("abc",myStringBuilder.toString());
        assertEquals("ab",myStringBuilder1.toString());
        assertEquals("ab",memory.getStringBuilder().toString());
    }

}