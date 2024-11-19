
public class Document {

    private String extension;
    private String encryption;

    public Document(String extension, String encryption) {
        this.extension = extension;
        this.encryption = encryption;
    }

    @Override
    public String toString() {
        return "Document [Extension: " + extension + ", Encryption: " + encryption + "]";
    }
}
