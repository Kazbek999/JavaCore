package LessonJC1;

public class Human implements RunJump {
    int maxHeight;
    int maxLength;
    String name;

    public Human (int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }
    public int getMaxHeight() {
        return maxHeight;
    }
    public void jump() {
        System.out.println("Человек прыгнул");
    }
    public int getMaxLength() {
        return maxLength;
    }
    public void run() {
        System.out.println("Человек пробежал");
            }
    @Override
    public String toString() {
        return name;
    }
}
