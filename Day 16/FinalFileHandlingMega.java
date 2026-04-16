import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FinalFileHandlingMega {

    // Simple class for serialization demo
    static class Student implements Serializable {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // -----------------------------------
        // 1. FILE RENAMING + BASIC OPERATIONS
        // -----------------------------------
        File oldFile = new File("old.txt");
        File newFile = new File("new.txt");

        try {
            oldFile.createNewFile(); // create file if not exists

            // rename file
            boolean renamed = oldFile.renameTo(newFile);

            if (renamed) {
                System.out.println("File renamed successfully");
            } else {
                System.out.println("File rename failed");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -----------------------------------
        // 2. DIRECTORY LISTING + FILTERING
        // -----------------------------------
        File dir = new File(".");

        File[] files = dir.listFiles();

        if (files != null) {
            System.out.println("Listing .txt files only:");

            for (File f : files) {

                // filter only .txt files
                if (f.isFile() && f.getName().endsWith(".txt")) {
                    System.out.println(f.getName());
                }
            }
        }

        // -----------------------------------
        // 3. FILE COMPARISON (CONTENT CHECK)
        // -----------------------------------
        File file1 = new File("a.txt");
        File file2 = new File("b.txt");

        try (
            FileInputStream f1 = new FileInputStream(file1);
            FileInputStream f2 = new FileInputStream(file2)
        ) {

            boolean identical = true;

            int byte1, byte2;

            while ((byte1 = f1.read()) != -1 && (byte2 = f2.read()) != -1) {

                if (byte1 != byte2) {
                    identical = false;
                    break;
                }
            }

            System.out.println("Files identical: " + identical);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -----------------------------------
        // 4. DATA STREAM (PRIMITIVE TYPES)
        // -----------------------------------
        try (
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
            DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"))
        ) {

            // write primitive types directly
            dos.writeInt(101);
            dos.writeDouble(99.99);
            dos.writeUTF("Java File Handling");

            dos.flush();

            // read back in same order
            System.out.println("Int: " + dis.readInt());
            System.out.println("Double: " + dis.readDouble());
            System.out.println("String: " + dis.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -----------------------------------
        // 5. OBJECT SERIALIZATION
        // -----------------------------------
        try (
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.obj"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.obj"))
        ) {

            Student s1 = new Student(1, "John");

            // write object
            oos.writeObject(s1);

            oos.flush();

            // read object
            Student s2 = (Student) ois.readObject();

            System.out.println("Student ID: " + s2.id);
            System.out.println("Student Name: " + s2.name);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // -----------------------------------
        // 6. SAFE FILE DELETE + TEMP FILES
        // -----------------------------------
        try {
            File temp = File.createTempFile("tempFile", ".txt");

            System.out.println("Temp file created: " + temp.getAbsolutePath());

            // delete on exit (safe cleanup)
            temp.deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -----------------------------------
        // 7. NIO BASIC FILE UTILITIES
        // -----------------------------------
        try {

            Path path = Paths.get("niofile.txt");

            // create file using NIO
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            // write using NIO
            Files.writeString(path, "Hello from NIO File System");

            // read using NIO
            String content = Files.readString(path);

            System.out.println("NIO Content: " + content);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -----------------------------------
        // 8. DIRECTORY CREATION + CHECKING
        // -----------------------------------
        File folder = new File("myDataFolder");

        if (!folder.exists()) {
            boolean created = folder.mkdir();

            System.out.println("Folder created: " + created);
        }

        // -----------------------------------
        // 9. FILE SIZE + PROPERTIES CHECK
        // -----------------------------------
        File checkFile = new File("niofile.txt");

        if (checkFile.exists()) {
            System.out.println("Size: " + checkFile.length());
            System.out.println("Readable: " + checkFile.canRead());
            System.out.println("Writable: " + checkFile.canWrite());
            System.out.println("Hidden: " + checkFile.isHidden());
        }
    }
}