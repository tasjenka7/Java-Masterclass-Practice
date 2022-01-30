package academy.learnprogramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

       LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        System.out.println("After adding place.");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        System.out.println("After removing place on index 4");
//        printList(placesToVisit);

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        printList(placesToVisit);
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("-----------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator(); // doesn't point to the first record

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if(comparison>0){
                // new city should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous(); // because we already moved to next one
                stringListIterator.add(newCity);
                return true;
            }else if(comparison<0){
                //move on next city
            }
        }

        stringListIterator.add(newCity); //if we passed all then it goes on the end
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary.");
            return;
        }else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true; // change way of going
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list.");
                        goingForward = true; //reached the first and changed direction
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n"+
                "1 - go to next city\n"+
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
