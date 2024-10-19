import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private List<Record> records;

    public List<Record> loadCSVtoList(String fileName) throws FileNotFoundException, IOException {
        records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Record record = new Record(values[0], values[1], values[2], values[3]);
                records.add(record);
            }
        }
        return records;
    }

    public List<Record> loadCSVtoAvl(String fileName) throws FileNotFoundException, IOException {
        records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Record record = new Record(values[0], values[1], values[2], values[3]);
                records.add(record);
            }
        }
        return records;
    }

    public void readCsvContents() {
        for (Record record : records) {
            record.printId();
            break;
        }
    }
}
