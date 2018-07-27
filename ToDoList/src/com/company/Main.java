package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); //second in is for standard input
    private static ToDoFunction myToDoList = new ToDoFunction();

    public static void main(String[] args) {
	// write your code here

        int command = 0;
        boolean exit = false;

        printCommand();

        while (!exit){
            System.out.println("Enter your command/choices: ");
            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {

                case 0:
                    printCommand();
                    break;
                case 1:
                    myToDoList.printToDoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;
                    default:
                        System.out.println("Please pick only from given command ");
            }
        }

    }

    public static void printCommand(){

        System.out.println("\n Commands: " +
                "\n Press 0: to get instructions " +
                "\n Press 1: to print all list " +
                "\n Press 2: to add list in ToDo " +
                "\n Press 3: to modify item in ToDo " +
                "\n Press 4: to remove item from ToDo " +
                "\n Press 5: to search an item from ToDo " +
                "\n Press 6: to exit from the app ");
    }

    public static void addItem(){
        System.out.println("Enter item to be added in ToDo list: ");
        myToDoList.addItem(scanner.nextLine());
    }

    public static void updateItem(){
        System.out.println("Enter the item number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new item to be added: ");
        String myNewItem = scanner.nextLine();
        myToDoList.updateToDo(index -1 ,myNewItem);

    }

    public static void removeItem(){
        System.out.println("Enter the item number to be deleted: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        myToDoList.removeItem(index - 1);
    }

    public static void searchItem(){
        System.out.println("Enter a string to be searched: ");
        String searchItem = scanner.nextLine();

        if(myToDoList.findItem(searchItem) == null){
            System.out.println("Item not found in ToDoList ");
        }
        else {
            System.out.println(searchItem + "was found in your list ");
        }
    }
}
