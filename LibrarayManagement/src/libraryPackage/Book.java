package libraryPackage;

public class Book {
    private String name; // id, author, price

    Book(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
