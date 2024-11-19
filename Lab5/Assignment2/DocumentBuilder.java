
public interface DocumentBuilder {

    void setExtension();

    void setEncryption(String encryption);

    Document buildDoc();
}
