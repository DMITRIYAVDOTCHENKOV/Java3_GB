package src.ru.avdotchenkov.lesson3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        File libDir = new File("src/main/resources/lib");
//        checkDir(libDir);
//        testFileMethods(libDir);
//        fileInputStreamTest(libDir);
        sequenceStreamTest(libDir);
    }

    private static void checkDir(File file) {
        if (file.isDirectory()) {
            String[] files = file.list(((dir, name) -> name.endsWith(".txt")));
            for (String f : files) {
                System.out.println(f);
            }
        } else {
            System.out.println("Это файл!");
        }
    }

    private static void testFileMethods(File libDir) throws IOException {
        File file = new File(libDir, "hp.txt");

/*        if (!file.exists()) {
            file.createNewFile();
        } else {
            file.delete();
        }*/

        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.length());
        System.out.println(new Date(file.lastModified()));
        System.out.println(file.getAbsolutePath());

        System.out.println(String.format("занято %s из %s%n", File.listRoots()[0].getUsableSpace(), File.listRoots()[0].getTotalSpace()));

        for (File listRoot : File.listRoots()) {
            System.out.println(listRoot);
        }

    }

    private static void fileInputStreamTest(File libDir) {
        File file = new File(libDir, "hp.txt");

        try (var in = new BufferedInputStream(new FileInputStream(file))) {

            int n;
            while ((n = in.read()) != -1) {
                System.out.print((char) n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sequenceStreamTest(File libDir) {
        ArrayList<InputStream> inputStreams = new ArrayList<>();

        try {
            inputStreams.add(new FileInputStream(libDir.getPath() + File.separator + "test1.txt"));
            inputStreams.add(new FileInputStream(libDir.getPath() + File.separator + "test2.txt"));
            inputStreams.add(new FileInputStream(libDir.getPath() + File.separator + "test3.txt"));

            SequenceInputStream sin = new SequenceInputStream(Collections.enumeration(inputStreams));

            int n;
            while ((n = sin.read()) != -1) {
                System.out.print((char) n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}