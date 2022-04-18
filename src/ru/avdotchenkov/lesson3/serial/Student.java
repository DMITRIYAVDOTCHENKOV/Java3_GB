package src.ru.avdotchenkov.lesson3.serial;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 8273932867032847718L;
    private int id;
    private String name;
    private transient Book book;
    private int age;

    public Student(int id, String name, Book book) {
        this.id = id;
        this.name = name;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", book=" + book + '}';
    }

    public void printInfo() {
        System.out.println(this);
    }
}
