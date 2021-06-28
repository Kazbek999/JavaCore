package LessonJC4;

import java.util.*;

public class Unique {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Sergei");
        names.add("Olga");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Olga");
        names.add("Piotr");
        names.add("Maxim");
        names.add("Denis");
        names.add("Maria");
        names.add("Denis");
        names.add("Alexei");
        Set<String> unique = new HashSet<String>(names);
        System.out.println("Уникальные имена: " + unique.toString());
        for (String key : unique) {
            System.out.println("Сколько раз встречается имя " + key +": " + Collections.frequency(names, key));
        }
    }
}
