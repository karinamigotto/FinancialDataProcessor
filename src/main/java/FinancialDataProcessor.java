import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FinancialDataProcessor {
    public static void main(String[] args) {
        String inputFilePath = "src/main/java/financial_data.csv";
        String outputFilePath = "cleaned_financial_data.csv";

        try (CSVParser parser = new CSVParser(new FileReader(inputFilePath), CSVFormat.DEFAULT.withHeader());
             FileWriter writer = new FileWriter(outputFilePath)) {

            List<CSVRecord> records = parser.getRecords();
            List<String[]> cleanedData = new ArrayList<>();

            for (CSVRecord record : records) {
                String date = record.get("Date");
                String stockPrice = record.get("Stock Price");

                if (date.isEmpty() || stockPrice.isEmpty()) continue;

                cleanedData.add(new String[]{date, stockPrice});
            }

            for (String[] row : cleanedData) {
                writer.append(String.join(",", row));
                writer.append("\n");
            }

            System.out.println("Data preprocessing completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
