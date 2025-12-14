package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringBuilderTest {

    @Test
    public void testSetText(){
        StringBuilder stringBuilder = new StringBuilder("ddd");
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.setStringBuilder(stringBuilder);
        assertEquals(stringBuilder,myStringBuilder.getStringBuilder());
    }

    @Test
    public void testCreateAndUndo(){
        StringBuilder stringBuilder = new StringBuilder("ddd");
        StringBuilder stringBuilder2 = new StringBuilder("aaa");
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.setStringBuilder(stringBuilder);
        assertEquals(stringBuilder,myStringBuilder.getStringBuilder());
        Memory memory = myStringBuilder.createMemory();
        myStringBuilder.setStringBuilder(stringBuilder2);
        assertEquals(stringBuilder2,myStringBuilder.getStringBuilder());
        myStringBuilder.undo(memory);
        assertEquals(stringBuilder,myStringBuilder.getStringBuilder());
    }

}