import java.io.*;
import java.nio.*;

public class BufferWriterImplementation {
    public static void main(String[] args){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("buffer.txt"));
                writer.write("Welcome to Buffer Writer\nThis demo working");
                writer.close();
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}