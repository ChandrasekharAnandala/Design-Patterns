package Factory.example2;

public class Client {
    public static void main(String[] args) {
        DocumentFactory documentFactory = DocumentFactoryProvider.getDocumentFactory(DocumentTypes.SPREADSHEET_DOCUMENT);
        Document document = documentFactory.createDocument();
        document.wrirte();
        document.save();
    }
}
