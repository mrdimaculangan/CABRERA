import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Driver {

    private final static String csvFileName = "LIMITED_ADS.csv";

    public static void main(String[] args) {
        CsvReader csvReader = new CsvReader();
        try {
            csvReader.loadCSV(csvFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        csvReader.readCsvContents();
    }
}
