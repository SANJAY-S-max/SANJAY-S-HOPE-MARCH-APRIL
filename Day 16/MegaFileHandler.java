import java.io.*;

public class MegaFileHandler {

    public static void main(String[] args) {

        // File objects (represent file paths, not actual data)
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        File reportFile = new File("report.txt");

        // Variables to store analysis data
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        // try-with-resources → automatically closes all streams
        try (
            // FileReader → reads characters from file
            // BufferedReader → improves performance (reads line by line)
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // FileWriter → writes characters to file
            // BufferedWriter → efficient writing using buffer
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Append mode enabled (true) → adds content instead of overwriting
            BufferedWriter reportWriter = new BufferedWriter(new FileWriter(reportFile, true))
        ) {

            String line;

            // Read file line by line until end (null)
            while ((line = reader.readLine()) != null) {

                // Count number of lines
                lineCount++;

                // Count characters (excluding newline)
                charCount += line.length();

                // Trim removes leading/trailing spaces
                // split("\\s+") splits based on spaces/tabs
                String[] words = line.trim().split("\\s+");

                // Avoid counting empty lines
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Convert text to uppercase and write to output file
                writer.write(line.toUpperCase());

                // Add new line manually (important!)
                writer.newLine();
            }

            // Writing analysis report
            reportWriter.write("===== FILE REPORT =====");
            reportWriter.newLine();

            reportWriter.write("Total Lines: " + lineCount);
            reportWriter.newLine();

            reportWriter.write("Total Words: " + wordCount);
            reportWriter.newLine();

            reportWriter.write("Total Characters: " + charCount);
            reportWriter.newLine();

            reportWriter.write("=======================");
            reportWriter.newLine();

            // Flush ensures all buffered data is written immediately
            writer.flush();
            reportWriter.flush();

            System.out.println("File processing completed successfully!");

        } 
        catch (FileNotFoundException e) {
            // Thrown when input file does not exist
            System.out.println("Error: Input file not found!");
        } 
        catch (IOException e) {
            // Handles all input/output related errors
            System.out.println("I/O Error occurred:");
            e.printStackTrace();
        }

        // Additional File operations after processing

        // Check if output file exists
        if (outputFile.exists()) {
            System.out.println("Output file created: " + outputFile.getName());
            System.out.println("File size: " + outputFile.length() + " bytes");
        }

        // Create a directory if not exists
        File dir = new File("backup");

        if (!dir.exists()) {
            boolean created = dir.mkdir(); // creates directory

            if (created) {
                System.out.println("Backup directory created.");
            } else {
                System.out.println("Failed to create directory.");
            }
        }
    }
}