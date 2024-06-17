package quiz5;

public class DummyCommunicationManager implements CommunicationManager {
    @Override
    public String sendMessage(String jsonData) {
        // Simulate a response from the chatbot service
        return "This is a dummy response to your message.";
    }
}