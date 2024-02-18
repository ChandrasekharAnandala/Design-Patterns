package Factory.example2;

public class DocumentFactoryProvider {

    public static DocumentFactory getDocumentFactory(DocumentTypes documentType){
        switch (documentType){
            case TEXT_DOCUMENT -> {
                return new TextDocumentFactory();
            }
            case SPREADSHEET_DOCUMENT -> {
                return new SpreadSheetDocumentFactory();
            }
            default -> throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
