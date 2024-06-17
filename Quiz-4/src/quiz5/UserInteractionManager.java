package quiz5;


import java.util.Scanner;

public class UserInteractionManager {
    private CommunicationManager communicationManager;

    public UserInteractionManager(CommunicationManager communicationManager) {
        this.communicationManager = communicationManager;
    }

    public void startInteraction() {
        Scanner scanner = new Scanner(System.in);
        String userId = "user1234";
        String sessionId = "session4567";

        while (true) {
            System.out.print("You: ");
            String message = scanner.nextLine();

            if (message.equalsIgnoreCase("exit")) {
                break;
            }

            // Create JSON data
            String jsonData = createJsonData(userId, sessionId, message);

            // Send message to the chatbot service
            String response = communicationManager.sendMessage(jsonData);

            // Print the chatbot's response
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }

    private String createJsonData(String userId, String sessionId, String message) {
        return String.format(
                "{\"user_id\":\"%s\",\"session_id\":\"%s\",\"message\":\"%s\",\"timestamp\":\"%s\",\"metadata\":{\"user_info\":{\"nickname\":\"Tavarish\",\"hobbies\":[\"editing\",\"playing on a guitar\",\"sketching\",\"calisthenics\"]},\"context\":\"chat\"}}",
                userId, sessionId, message, java.time.Instant.now().toString()
        );
    }

    public static void main(String[] args) {
        CommunicationManager communicationManager = new DummyCommunicationManager();
        UserInteractionManager userInteractionManager = new UserInteractionManager(communicationManager);
        userInteractionManager.startInteraction();
    }
}