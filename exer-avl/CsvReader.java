import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList; // import the ArrayList class
import java.util.Arrays;
import java.util.List;

public class CsvReader {
    private List<List<String>> records;

    public List<List<String>> loadCSV(String fileName) throws FileNotFoundException, IOException {
        records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        }
        return records;
    }

    public void readCsvContents() {
        for (List record : records) {
            System.out.println(record);
        }
    }
}
