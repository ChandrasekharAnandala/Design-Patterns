package Factory.example2;

public class SpreadSheetDocumentFactory implements DocumentFactory
{
    @Override
    public Document createDocument() {
        return new SpreadsheetDocument();
    }
}
