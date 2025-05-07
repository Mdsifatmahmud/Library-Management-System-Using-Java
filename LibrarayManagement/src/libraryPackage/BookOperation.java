package libraryPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class BookOperation {

    public Book register(){
        System.out.println("Enter book name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Book book = new Book(name);
        return  book;
    }

    public void show(ArrayList<Book> books){
        int i = 1;
        for(Book b: books){
            System.out.println((i++) + ": "+"Name: "+ b.getName());
        }
    }

    public Book findBook(ArrayList<Book> books){
        System.out.println("Enter book name");
        String name = (new Scanner(System.in)).nextLine();

        for(int i = 0;i<books.size();i++){
            Book b = books.get(i);
            if(b.getName().equalsIgnoreCase(name) == true){
                System.out.println("Name: "+ b.getName());
                return b;
            }
        }
        System.out.println("No book is found");
        return null;
    }
}
