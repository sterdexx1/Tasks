package task;

public class MyStringBuilder {

    private final StringBuilder stringBuilder;

    public MyStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    @Override
    public String toString() {
        return new String(this.stringBuilder.toString());
    }

    public Memory createMemory(){
        return new Memory(new MyStringBuilder(new StringBuilder(this.getStringBuilder())));
    }

    public MyStringBuilder undo(Memory memory){
        return new MyStringBuilder(memory.getStringBuilder());
    }
}
//-----------------------------------------------
class Memory {
    private final StringBuilder stringBuilder;

    public Memory(MyStringBuilder myStringBuilder) {
        this.stringBuilder = myStringBuilder.getStringBuilder();
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }
}

