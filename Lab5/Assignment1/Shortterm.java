
public class Shortterm implements ContactBuilder {

    private String contactID;
    private double rentAmount;
    private String ternantID;
    private String propertyID;

    @Override
    public void buildContactID(String contactID) {
        this.contactID = contactID;
    }

    @Override
    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public void buildTernantID(String ternantID) {
        this.ternantID = ternantID;
    }

    @Override
    public void buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public Contact signContact() {
        return new Contact(this.contactID, this.rentAmount, this.ternantID, this.propertyID);
    }

    @Override
    public String toString() {
        return ("Short term contact[" + "Contact id: " + this.contactID + ", " + "Property id: "
                + this.propertyID
                + ", " + "Rent Amount: "
                + this.rentAmount + ", " + "Ternant id: " + this.ternantID + "]");
    }
}
