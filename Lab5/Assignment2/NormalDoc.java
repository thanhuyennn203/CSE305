
public class NormalDoc implements DocumentBuilder {

    String extension;
    String encryption;

    @Override
    public void setExtension() {
        this.extension = ".txt";
    }

    @Override
    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    @Override
    public Document buildDoc() {
        return new Document(this.extension, this.encryption);
    }
}
