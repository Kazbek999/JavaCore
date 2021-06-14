package LessonJC1;

public class Wall implements Actions {
    int height;

    public Wall(int height) {
        this.height = height;
    }


    public boolean toRun(int maxLength) {
        return false;
    }

    public boolean toJump(int maxHeight) {
        return (maxHeight >= height);
    }
    public String toString() {
        return "Препятствие на " + height + " м";
    }

}
