package Factory.example2;

public class SpreadsheetDocument implements Document{
    @Override
    public void wrirte() {
        System.out.println("Writing in Spreadsheet document...");
    }

    @Override
    public void save() {
        System.out.println("Saving spreadsheet..");
    }
}
