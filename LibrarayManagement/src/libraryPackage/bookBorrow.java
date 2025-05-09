package libraryPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class bookBorrow {
    public void borrow(ArrayList<User> users, ArrayList<Book> books){
        User user = (new UserOperation()).find(users);
        if(user == null){
            System.out.println("Please register first");
            return;
        }

        if(user.getBook() != null){
            System.out.println("Please return the \""+ user.getBook().getName() +"\" book first");
            return;
        }

        Book book = (new BookOperation()).findBook(books);
        if(book == null){
            System.out.println("Sorry, chose another one");
            return;
        }

        user.setBook(book);
        System.out.println("Congrats, the " + book.getName() + " book is assigned to you");

    }

    public void returnBook(ArrayList<User> users){
        User user = (new UserOperation()).find(users);
        if(user == null){
            System.out.println("Please register first");
            return;
        }

        if(user.getBook() == null){
            System.out.println("Sorry, you have no book to return");
            return;
        }


        System.out.println("Thank you for returning the "+ user.getBook().getName()+" book");
        user.setBook(null);

    }
}
