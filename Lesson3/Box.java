package LessonJC3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;


    public Box(T... fruit) {
        list = Arrays.asList(fruit);
    }

    public Box() {
        list = new ArrayList<T>();
    }
    public void add(T fruit) {
        list.add(fruit);
    }
    void moveTo(Box<T> box) {
        box.list.addAll(list);
        list.clear();
    }
    public void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("В коробке находятся " + list.get(0).toString() + " в количестве: " + list.size());
        }
    }
    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }
    public boolean compare(Box<?> o) {
          return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }

    public static void main(String[] args) {

        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();


        for (int i = 0; i < 6; i++) {
            orangeBox1.add(new Orange());
        }
        for (int i = 0; i < 10; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 15; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveTo(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }
}
