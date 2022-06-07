package Lesson_practice_2;

import java.util.*;

public class main {

    public static void main(String[] args) {
        List personList = new ArrayList<>();
        Person tom = new Person(24, "Tom");
        personList.add(tom);
        Person tom2 = new Person(21, "Tom");
        personList.add(tom2);
        Person tom3 = new Person(26, "Tom");
        personList.add(tom3);
        Person alx1 = new Person(18, "Alex");
        personList.add(alx1);
        Person vlad = new Person(20, "Alex");
        personList.add(vlad);
        Person vladimir = new Person(19, "Alex");
        personList.add(vladimir);
        Person vladlen = new Person(21, "Vladlen");
        personList.add(vladlen);
        Person sem = new Person(25, "Semen");
        personList.add(sem);
        Person vis = new Person(28, "Vasisualy");
        personList.add(vis);
        Person art = new Person(23, "Artiom");
        personList.add(art);

        System.out.println(calc(personList));

//        System.out.println(test.tbd);
//        Map<String,Integer> testMap = new HashMap<>();
//        for (Person person : personList) {
//        testMap.put(person.getName(), person.getAge());
//        }


    }

    public static Map<String, Integer> calc(List<Person> list) {
        Map<String, Integer> map1 = new HashMap<>();
        for (Person person : list) {
            if (map1.containsKey(person.getName())) {
                Integer sumAge = map1.get(person.getName());
                sumAge += person.getAge();
                map1.put(person.getName(), sumAge);
            } else {
                map1.put(person.getName(), person.getAge());
            }

        }
        return map1;
    }
}

