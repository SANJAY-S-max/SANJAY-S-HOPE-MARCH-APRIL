import java.io.*;

public class fileWriterImplementation {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Welcome to File Handling\nThis is demo working");
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
        // try{
        //     FileWriter writer = new FileWriter("file.txt");
        //     int c;
        //     while((c = System.in.read()) != -1){
        //         writer.write(c);
        //     }
        //     writer.close();
        // }catch(Exception e){
        //     System.out.println(e);
        // }
    }  
}
