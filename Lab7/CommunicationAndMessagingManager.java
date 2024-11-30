
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Message {

    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    // Getters for message properties
    public String getContent() {
        return this.content;
    }

    public String getSender() {
        return this.sender;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public void printSummary() {
        System.out.println("Content: " + content);
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
    }

    public void printDetails() {
        System.out.println("Content: " + content);
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Content Length: " + content.length());
        System.out.println("Sender Uppercase: " + sender.toUpperCase());
        System.out.println("Recipient Lowercase: " + recipient.toLowerCase());
    }
}

class MessagingService {

    private final Map<String, List<Message>> inbox;

    public MessagingService() {
        this.inbox = new HashMap<>();
    }

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(message.getRecipient(), k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, new ArrayList<>());
    }

    public void printMessagesForRecipient(String recipient) {
        System.out.println("Messages for " + recipient);
        for (Message message : this.inbox.get(recipient)) {
            System.out.println("From: " + message.getSender() + ", Content: " + message.getContent());
        }
        System.out.println("--------------------------");
    }

    public void printAllMessages() {
        System.out.println("All messages: ");
        for (String recipient : inbox.keySet()) {
            List<Message> messages = inbox.get(recipient);
            for (Message message : messages) {
                System.out.println("Recipient: " + message.getRecipient());
                System.out.println("Sender: " + message.getSender());
                System.out.println("Content: " + message.getContent());
                System.out.println();
            }
        }
    }
}

public class CommunicationAndMessagingManager {

    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        // sending messages
        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        messagingService.sendMessage("Maintenance request received.", "Tenant A", "Property Manager");

        // retrieving messages for a recipient
        String recipient = "Tenant A";
        messagingService.printMessagesForRecipient(recipient);

        // Calling the new method
        Message exampleMessage = new Message("Test", "Sender", "Recipient");
        exampleMessage.printDetails();

        //print all messages
        messagingService.printAllMessages();
    }
}
