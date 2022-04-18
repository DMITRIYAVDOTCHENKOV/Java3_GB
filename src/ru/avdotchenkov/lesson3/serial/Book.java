package src.ru.avdotchenkov.lesson3.serial;

public class Book {
    private String name;


    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + '}';
    }
}
