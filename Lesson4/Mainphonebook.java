package LessonJC4;

public class Mainphonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Fraser", "11111111");
        phonebook.add("Paul", "22222222");
        phonebook.add("Li", "33333333");
        phonebook.add("Fraser", "44444444");
        phonebook.add("Paul", "55555555");
        phonebook.add("Fraser", "66666666");
        System.out.println("--------------------------");
        System.out.println("Запись есть");
        System.out.println(phonebook.get("Fraser"));
        System.out.println(phonebook.get("Li"));
        System.out.println(phonebook.get("Paul"));
        System.out.println("--------------------------");
        System.out.println("Записи нет");
        System.out.println(phonebook.get("Johnson"));
        System.out.println(phonebook.get("Peterson"));
        System.out.println("--------------------------");
        phonebook.add("Fraser", "11111111");
        System.out.println(phonebook.get("Fraser"));
    }
}
