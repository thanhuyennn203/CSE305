
public interface ContactBuilder {

    void buildContactID(String contactID);

    void buildPropertyID(String propertyID);

    void buildTernantID(String ternantID);

    void buildRentAmount(double rentAmount);

    Contact signContact();
}
