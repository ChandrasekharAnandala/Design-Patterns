package Factory.example2;

public class TextDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
