package libraryPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void display(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        display("Welcome to Library Management Application");

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();

        while (true){
            display("1 for registering book");
            display("2 for show all books");
            display("3 for registering user");
            display("4 for show all users");
            display("5 borrow a book");
            display("6 return the book");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            BookOperation bookOperation = new BookOperation();
            UserOperation userOperation = new UserOperation();
            bookBorrow bookBorrow = new bookBorrow();
            switch (choice){
                case 1:
                    books.add(bookOperation.register());
                    break;
                case 2:
                    bookOperation.show(books);
                    break;
                case 3:
                    users.add(userOperation.register());
                    break;
                case 4:
                    userOperation.show(users);
                    break;
                case 5:
                    bookBorrow.borrow(users,books);
                    break;
                case 6:
                    bookBorrow.returnBook(users);
                default:
            }

        }
    }
}
