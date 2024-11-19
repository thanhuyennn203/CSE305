
import java.util.*;

public class Clients {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "What kind of contact do you want:\n1. Permanent Contact\n2. Long Term Contact\n3. Short Term Contact");
        int contactChoice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter contact id: ");
        String contactID = sc.nextLine();

        System.out.println("Enter rent amount(number only): ");
        double rentAmount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter property id: ");
        String propertyID = sc.nextLine();

        System.out.println("Enter ternant id: ");
        String ternantID = sc.nextLine();

        ContactBuilder request = null;

        if (contactChoice == 1) {
            request = new Permanent();
        } else if (contactChoice == 2) {
            request = new Longterm();
        } else if (contactChoice == 3) {
            request = new Shortterm();
        }

        request.buildContactID(contactID);
        request.buildRentAmount(rentAmount);
        request.buildPropertyID(propertyID);
        request.buildTernantID(ternantID);
        Contact ct = request.signContact();

        System.out.println(request.toString());

    }
}
