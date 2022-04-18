package src.ru.avdotchenkov.lesson3.external;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("src/main/resources/lib/save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


        UserInfo userInfo = (UserInfo) objectInputStream.readObject();
        System.out.println(userInfo);

        objectInputStream.close();

    }
}