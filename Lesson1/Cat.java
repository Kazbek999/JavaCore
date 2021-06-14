package LessonJC1;

public class Cat implements RunJump {
    int maxHeight;
    int maxLength;
    String name;

    public Cat(int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }
    public int getMaxHeight() {
        return maxHeight;
    }
    public void jump() {
        System.out.println("Кот прыгнул");
    }
    public int getMaxLength() {
        return maxLength;
    }
    public void run() {
        System.out.println("Кот пробежал");
    }

        @Override
        public String toString() {
            return name;
        }
    }

