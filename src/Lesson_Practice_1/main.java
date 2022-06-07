package Lesson_Practice_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        /*3)	В кругу стоят N человек, пронумерованных от 1 до N.
         При ведении счета по кругу вычеркивается каждый второй человек,
         пока не останется один. Составить две программы, моделирующие процесс.
         Одна из программ должна использовать класс ArrayList, а вторая - LinkedList.
         */

        int max = 100;
        int min = 1;
        int N = (int) (Math.random() * (max - min + 1) + min);

        ArrayList<Integer> persons = new ArrayList<>(N);

        for(int x = 1; x < N; x++){
            persons.add(x);
        }

        LinkedList<Integer> persons2 = new LinkedList(persons);

        System.out.println(persons);
        while (persons.size() > 1) {
            for (int c = 0; c < persons.size() - 1; c++) {
                persons.remove(c + 1);

            }
            System.out.println(persons);
        }
        System.out.println("person 1 = " + persons);

        //Linked List//
        N = (int) (Math.random() * (max - min + 1) + min);

        System.out.println(persons2);
        while (persons2.size() > 1) {
            for (int c = 0; c < persons2.size() - 1; c++) {
                persons2.remove(c + 1);

            }
            System.out.println(persons2);
        }
        System.out.println("person 2 = " + persons2);

    }
}
