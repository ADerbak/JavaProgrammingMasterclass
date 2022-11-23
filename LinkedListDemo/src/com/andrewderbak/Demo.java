package com.andrewderbak;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");

        printList(placesToVisit);

        placesToVisit.remove(4);

        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        // This works!
        //        for (int i = 0; i < linkedList.size(); i++) {
        //            System.out.println(linkedList.get(i));
        //        }
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting " + i.next()); //Returns the current value, and then moves to the next value
        }
        System.out.println("=======================");
    }
}
