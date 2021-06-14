package LessonJC1;

public class Main {
    public static void main(String[] args) {
        RunJump[] sportsmen = {
                new Human(4, 6, "Иван"),
                new Human(2, 7, "Петр"),
                new Cat(5, 6, "Барсик"),
                new Cat(1, 1, "Васька"),
                new Robot(3, 5, "робот Федор"),
                new Robot(6, 9, "робот Бендер")
        };

        Actions[] actions = {
                new Treadmill(5),
                new Treadmill(7),
                new Wall(3),
                new Wall(5)
        };

        for (RunJump sportsman : sportsmen) {
            System.out.println(sportsman);

            for (Actions action : actions) {
                System.out.println("Действие: " + action);
                if (action.toJump(sportsman.getMaxHeight()) ||
                        action.toRun(sportsman.getMaxLength())) {
                    System.out.println("Успешно");
                } else {
                    System.out.println("Неуспешно");
                    break;
                }
            }
        }
    }
}




