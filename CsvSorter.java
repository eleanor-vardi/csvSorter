import java.io.*;
import java.util.*;

public class CsvSorter {

    public static void main(String[] args) throws IOException {
        // Load configuration
        Properties config = loadConfig("resources/config.properties");

        // Configuration values
        String inputFile = config.getProperty("input.file.path");
        String outputFile = config.getProperty("output.file.path");
        int maxRecordsInMemory = Integer.parseInt(config.getProperty("max.records.in.memory"));
        int keyFieldIndex = Integer.parseInt(config.getProperty("key.field.index"));

        // TODO: Implement file reading and splitting into chunks
        // Read the input file, split it into manageable chunks, sort, and save each chunk
    }

    private static Properties loadConfig(String configFilePath) throws IOException {
        Properties config = new Properties();
        try (InputStream input = new FileInputStream(configFilePath)) {
            config.load(input);
        }
        return config;
    }

    // Provided utility for writing sorted data to a temporary file
    private static File writeSortedToTempFile(List<String[]> sortedData) throws IOException {
        File tempFile = File.createTempFile("sorted_chunk", ".csv");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            for (String[] row : sortedData) {
                writer.write(String.join(",", row));
                writer.newLine();
            }
        }
        return tempFile;
    }

    // TODO: Implement the merge logic for combining sorted chunks
}
