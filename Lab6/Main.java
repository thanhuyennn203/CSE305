
public class Main {

    public static void main(String[] args) {
        RequestCreator lowPriorityCreator = new LowPriorityConcreteCreator();
        lowPriorityCreator.processRequest();

        RequestCreator midPriorityCreator = new MediumPriorityConcreteCreator();
        midPriorityCreator.processRequest();

        RequestCreator highPriorityCreator = new HighPriorityConcreteCreator();
        highPriorityCreator.processRequest();
    }
}
