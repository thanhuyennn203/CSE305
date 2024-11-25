
import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {

    String priority;
    String status;
    LocalDate expire;

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setExpire() {
        this.expire = LocalDate.now();
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
}
