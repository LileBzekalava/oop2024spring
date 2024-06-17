package quiz6;

import java.util.ArrayList;
import java.util.List;

public class SpecialCommunicationManager {
    private String commonServiceUrl;
    private String specialServiceUrl;
    private List<String> conversationHistory;

    public SpecialCommunicationManager(String commonServiceUrl, String specialServiceUrl) {
        this.commonServiceUrl = commonServiceUrl;
        this.specialServiceUrl = specialServiceUrl;
        this.conversationHistory = new ArrayList<>();
    }

    public void addMessageToHistory(String message) {
        conversationHistory.add(message);
    }

    public String processUserMessage(String message) {
        addMessageToHistory(message);

        if (message.contains("help") || historyContainsHelp()) {
            return sendRequestToService(specialServiceUrl, message);
        } else {
            return sendRequestToService(commonServiceUrl, message);
        }
    }

    private boolean historyContainsHelp() {
        for (String msg : conversationHistory) {
            if (msg.contains("help")) {
                return true;
            }
        }
        return false;
    }

    private String sendRequestToService(String serviceUrl, String message) {
        // Simulate sending the request to the service and getting a response.
        // In a real-world scenario, this would involve making an HTTP request.
        return "Request sent to " + serviceUrl + " with message: " + message;
    }

    public static void main(String[] args) {
        // Example usage:
        SpecialCommunicationManager manager = new SpecialCommunicationManager("http://common.service.url", "http://special.service.url");

        System.out.println(manager.processUserMessage("I need some information."));
        System.out.println(manager.processUserMessage("Can you help me with this issue?"));
    }
}