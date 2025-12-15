package task;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        MyStringBuilder myStringBuilder = new MyStringBuilder(stringBuilder);
        stringBuilder.append("a");
        stringBuilder.append("b");
        Memory memory = myStringBuilder.createMemory();
        stringBuilder.append("c");
        MyStringBuilder myStringBuilder1 = myStringBuilder.undo(memory);
        System.out.println("StringBuilder: " + stringBuilder);
        System.out.println("MyStringBuilder: " + myStringBuilder1);
        System.out.println("Memory: " + memory.getStringBuilder());
    }
}
