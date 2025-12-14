package task;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        StringBuilder stringBuilder = new StringBuilder("ddd");
        myStringBuilder.setStringBuilder(stringBuilder);
        Memory memory = myStringBuilder.createMemory();
        myStringBuilder.setStringBuilder(new StringBuilder("aaa"));
        myStringBuilder.setStringBuilder(new StringBuilder("qqq"));
        myStringBuilder.undo(memory);
        System.out.println(myStringBuilder);
    }
}
