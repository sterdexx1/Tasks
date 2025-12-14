package task;

public class MyStringBuilder {

    private StringBuilder stringBuilder;

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public Memory createMemory(){
        return new Memory(stringBuilder);
    }

    public void undo(Memory memory){
        this.stringBuilder = memory.getStringBuilder();
    }

    @Override
    public String toString() {
        return String.valueOf(this.getStringBuilder());
    }
}

class Memory {
    private StringBuilder stringBuilder;

    public Memory(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

}

