package LessonJC4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    public HashMap<String, List<String>> phonebook = new HashMap<>();

    public void add(String lastname, String number){
        if(phonebook.containsKey(lastname)){
            List<String> numbers = phonebook.get(lastname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Номер %s добавлен, фамилия: %s", number, lastname));
            } else {
                System.out.println(String.format("Номер %s уже существует, фамилия: %s", number, lastname));
            }
        } else {
            phonebook.put(lastname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер %s добавлен, фамилия: %s", number, lastname));
        }
    }
    public List<String> get(String lastname){
        if(phonebook.containsKey(lastname)){
            System.out.println(String.format("%s", lastname));
            return phonebook.get(lastname);
        } else {
            System.out.println(String.format("В справочнике нет фамилии: %s", lastname));
            return new ArrayList<>();
        }
    }
}