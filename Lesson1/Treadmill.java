package LessonJC1;

public class Treadmill implements Actions {
    int length;

    public Treadmill(int length) {
        this.length = length;
    }


    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }


    public boolean toJump(int maxHeight) {
        return false;
    }
    public String toString() {
        return "Забег на " + length + " м";
    }
}
