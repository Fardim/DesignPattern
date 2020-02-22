package com.designpattern.facade;

public class NotificationService {
    public void send(String message, String target) {
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("ipAddress");
        AuthToken authToken = server.authenticate("appId", "key");
        server.send(authToken, new Message(message) , target);
    }
}
