package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Clean code", (short) 464);
        Book two = new Book("Head First Java", (short) 720);
        Book three = new Book("Java. Полное руководство", (short) 1344);
        Book four = new Book("Мёртвые души", (short) 352);
        Book[] books = new Book[]{one, two, three, four};
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + ", " + books[index].getNumberOfPages() + " стр");
        }

        System.out.println("Change index 0 and 3");
        books[0] = four;
        books[3] = one;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + ", " + books[index].getNumberOfPages() + " стр");
        }

        System.out.println("Only books with name \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(books[index].getName() + ", " + books[index].getNumberOfPages() + " стр");
            }
        }
    }
}
