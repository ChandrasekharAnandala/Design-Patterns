package Factory.example2;



public class TextDocument implements Document {
    @Override
    public void wrirte() {
        System.out.println("Writing in text document..");
    }

    @Override
    public void save() {
        System.out.println("Saving text document....");
    }
}
