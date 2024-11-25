
import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct {

    String priority;
    String status;
    LocalDate expire;

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setExpire() {
        this.expire = LocalDate.now();
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }

}
