
import java.util.Scanner;

public class Client {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Store document as:\n" + "1. Nomal Document\n" + "2. Confidential Document:");
        int choice = sc.nextInt();

        DocumentBuilder db = null;

        if (choice == 1) {
            db = new NormalDoc();
        } else if (choice == 2) {
            db = new ConfidentialDoc();
        }

        //your document here
        String document = "document";
        db.setEncryption(document);
        db.setExtension();
        Document nd = db.buildDoc();
        System.out.println(nd);
    }
}
