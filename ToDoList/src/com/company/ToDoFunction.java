package com.company;

import java.util.ArrayList;

public class ToDoFunction {

    private ArrayList<String> todoList = new ArrayList<String>();

    //add list item
    public void addItem(String item){
        todoList.add(item);
    }

    //remove list item
    public void removeItem(int index){
        String myItem = todoList.get(index);
        todoList.remove(index);
    }

    //print the entire list
    public void printToDoList(){
        System.out.println("ToDo list consist of: " + todoList.size() + "items");
        for (int i =0; i<todoList.size(); i++){
            System.out.println("item at position: " + (i+1) + "is " + todoList.get(i));
        }
    }

    //Update the list
    public void updateToDo(int index, String list){
            todoList.set(index,list);
            System.out.println("Updation completed at position:  " + index+1);
    }

    //Search feature for user
    public String findItem(String searchItem){
            int index = todoList.indexOf(searchItem);

            if(index == -1){
                return null;
            }
            else {
                return todoList.get(index);
            }
    }
}
