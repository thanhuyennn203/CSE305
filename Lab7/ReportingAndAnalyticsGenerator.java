
import java.util.List;

class Property {

    private String name;
    private double rentAmount;
    private String ownerName;
    private String location;

    // Constructor with a data clump
    public Property(String name, double rentAmount, String ownerName, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public double getRentAmount() {
        return this.rentAmount;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getLocation() {
        return this.location;
    }

    public boolean isPremiumProperty(double threshold) {
        return this.rentAmount > threshold;
    }

    public double calculateYearlyRent() {
        return this.rentAmount * 12;
    }

    public void printPropertyDetails() {
        System.out.println("Property: " + getName());
        System.out.println("Rent Amount: $" + getRentAmount());
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Location: " + getLocation());
    }
}

class FinancialReport {

    private String reportTitle;
    private List<Property> properties;
    private double totalRent;
    private static final double PREMIUM_THRESHOLD = 2000;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void setTotalRent(double total) {
        this.totalRent = total;
    }

    public double getTotalRent() {
        return this.totalRent;
    }

    public void generateReport() {
        double total = 0;
        System.out.println("Financial Report: " + this.reportTitle);
        System.out.println("----------------------------");
        for (Property property : this.properties) {
            property.printPropertyDetails();
            total += property.getRentAmount();

            if (property.isPremiumProperty(this.PREMIUM_THRESHOLD)) {
                System.out.println("This is a premium property.");
            } else {
                System.out.println("This is a standard property.");
            }

            double yearlyRent = property.calculateYearlyRent();
            System.out.println("Yearly Rent: $" + yearlyRent);
            System.out.println("--------------------");
        }
        setTotalRent(total);
        System.out.println("Total Rent Amount: $" + getTotalRent());
    }
}

public class ReportingAndAnalyticsGenerator {

    public static void main(String[] args) {
        Property property1 = new Property("Apartment A", 1500.0, "John Doe", "City Center");
        Property property2 = new Property("House B", 2000.0, "Jane Smith", "Suburb");
        Property property3 = new Property("Condo C", 1800.0, "Bob Johnson", "Downtown");

        FinancialReport financialReport = new FinancialReport("Monthly Rent Summary", List.of(property1, property2, property3));
        financialReport.generateReport();

    }
}
