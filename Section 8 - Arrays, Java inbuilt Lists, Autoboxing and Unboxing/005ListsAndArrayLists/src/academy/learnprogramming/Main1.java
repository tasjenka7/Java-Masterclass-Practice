package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;

            }
        }
    }


    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item name: ");
       // int itemNo = scanner.nextInt();
        String item = scanner.nextLine();
    //    scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
       // groceryList.modifyGroceryItem(itemNo-1, newItem); // Human number is +1 to the computers
    }

    public static void removeItem(){
//        System.out.print("Enter item number: ");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
//        groceryList.removeGroceryItem(itemNo-1);
        System.out.println("Enter item name: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem(){
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
//        if(groceryList.findItem(searchItem) != null){
//            System.out.println("Found " + searchItem + " in out grocery list");
//        }else{
//            System.out.println(searchItem + " is not in the shopping list");
//        }
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem);
        }else{
            System.out.println(searchItem + " not on file.");
        }
    }

    //Multiple ways of copying elements into new ArrayList witout for loop
    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }


}

