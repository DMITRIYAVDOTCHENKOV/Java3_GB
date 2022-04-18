package src.ru.avdotchenkov.lesson3.serial;

import java.io.*;

public class ObjectReader {

    public static void main(String[] args) {
        File file = new File("src/main/resources/lib/student.txt");

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Student student = (Student) ois.readObject();
            student.printInfo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
