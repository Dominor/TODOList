package org.academiadecodigo.splicegirls36.todolist;

public class Main {
    public static void main(String[] args) {

        TODOList todoList = new TODOList();

        todoList.add(TODOList.ImportanceLevel.HIGH, 2, "Create GUI for Briscola of three.");
        System.out.println(todoList);

        todoList.add(TODOList.ImportanceLevel.HIGH, 3, "Remake car-crash project");
        System.out.println(todoList);

        todoList.add(TODOList.ImportanceLevel.HIGH, 1, "Store and compare cards using Java Collections");
        System.out.println(todoList);

        todoList.add(TODOList.ImportanceLevel.MEDIUM, 2, "Master Git");
        System.out.println(todoList);

        todoList.add(TODOList.ImportanceLevel.MEDIUM, 1, "Learn VIM");
        System.out.println(todoList);

        todoList.add(TODOList.ImportanceLevel.LOW, 2, "Learn another language");
        System.out.println(todoList);

        todoList.add(TODOList.ImportanceLevel.LOW, 1, "Do nothing.");
        System.out.println(todoList);

        while (!todoList.isEmpty()) {
            System.out.println("Removing " + todoList.remove());
        }
    }
}
