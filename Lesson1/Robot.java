package LessonJC1;

public class Robot implements RunJump {
    int maxHeight;
    int maxLength;
    String name;


    public Robot(int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void jump() {
        System.out.println("Робот прыгнул");
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void run() {
        System.out.println("Робот пробежал");
    }

    @Override
    public String toString() {
        return name;
    }
}
