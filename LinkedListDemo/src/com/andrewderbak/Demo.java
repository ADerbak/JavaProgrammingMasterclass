package com.andrewderbak;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");

//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//
//        printList(placesToVisit);
//
//        placesToVisit.remove(4); // can also remove by string value!
//
//        printList(placesToVisit);



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

    // Create a method to add cities in alphabetical order
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new city should appear before this one
                // Brisbane (existing) -> Adelaide (new)
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move to next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }
}

