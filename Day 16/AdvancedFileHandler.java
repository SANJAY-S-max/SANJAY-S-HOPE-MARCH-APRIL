import java.io.*;

public class AdvancedFileHandler {

    public static void main(String[] args) {

        // File paths
        File sourceFile = new File("input.txt");
        File binaryCopyFile = new File("copy.bin");
        File randomFile = new File("random.txt");

        // -------------------------------
        // 1. BYTE STREAM COPY (Binary Safe)
        // -------------------------------
        try (
            // FileInputStream → reads raw bytes (binary data)
            FileInputStream fis = new FileInputStream(sourceFile);

            // FileOutputStream → writes raw bytes
            FileOutputStream fos = new FileOutputStream(binaryCopyFile)
        ) {

            // Buffer array (faster than single byte read)
            byte[] buffer = new byte[1024]; // 1KB buffer
            int bytesRead;

            // Read chunks of bytes until end (-1)
            while ((bytesRead = fis.read(buffer)) != -1) {

                // Write only the bytes that were read
                fos.write(buffer, 0, bytesRead);
            }

            // Flush ensures all data is written
            fos.flush();

            System.out.println("Binary file copy completed!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------
        // 2. RANDOM ACCESS FILE
        // -------------------------------
        try (
            // "rw" mode → read + write
            RandomAccessFile raf = new RandomAccessFile(randomFile, "rw")
        ) {

            // Write data to file
            raf.writeBytes("Hello World\n");
            raf.writeBytes("Java File Handling\n");

            // Move file pointer to beginning
            raf.seek(0);

            // Read first line
            String firstLine = raf.readLine();
            System.out.println("First Line: " + firstLine);

            // Move pointer to specific position (e.g., byte 6)
            raf.seek(6);

            // Overwrite part of file
            raf.writeBytes("JAVA");

            // Move pointer again to beginning
            raf.seek(0);

            System.out.println("Modified Content:");

            String line;
            // Read entire file line by line
            while ((line = raf.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------
        // 3. PARTIAL FILE READING
        // -------------------------------
        try (
            FileInputStream fis = new FileInputStream(sourceFile)
        ) {

            // Skip first 10 bytes
            fis.skip(10);

            int data;
            System.out.println("Reading after skipping 10 bytes:");

            // Read next few bytes
            for (int i = 0; i < 20; i++) {
                data = fis.read();
                if (data == -1) break;

                // Convert byte to character
                System.out.print((char) data);
            }

            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------
        // 4. WRITING MULTIPLE DATA TYPES
        // -------------------------------
        try (
            FileOutputStream fos = new FileOutputStream("data.bin")
        ) {

            // Writing raw byte values
            fos.write(65); // ASCII 'A'
            fos.write(66); // ASCII 'B'

            // Writing byte array (string converted to bytes)
            byte[] data = "HelloBinary".getBytes();
            fos.write(data);

            fos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------
        // 5. FILE METADATA USING FILE CLASS
        // -------------------------------
        File file = new File("data.bin");

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        }

        // -------------------------------
        // 6. DELETE FILE EXAMPLE
        // -------------------------------
        File tempFile = new File("temp.txt");

        try {
            // Create temp file
            tempFile.createNewFile();

            if (tempFile.exists()) {
                System.out.println("Temp file created.");
            }

            // Delete file
            boolean deleted = tempFile.delete();

            if (deleted) {
                System.out.println("Temp file deleted.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}