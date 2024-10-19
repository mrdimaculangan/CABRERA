public class Record {
    private String id;
    private String date;
    private String category;
    private String name;

    public Record(String id, String date, String category, String name) {
        this.id = id;
        this.date = date;
        this.category = category;
        this.name = name;
    }

    public void printId() {
        System.out.println(this.id);
    }
}
