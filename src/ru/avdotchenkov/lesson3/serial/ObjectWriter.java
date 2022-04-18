package src.ru.avdotchenkov.lesson3.serial;

import java.io.*;

public class ObjectWriter {

    public static void main(String[] args) {
        Student student = new Student(10, "Мартин", new Book("Грокаем алгоритмы"));

        File file = new File("src/main/resources/lib/student.txt");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
