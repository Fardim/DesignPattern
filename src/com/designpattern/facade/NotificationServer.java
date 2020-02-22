package com.designpattern.facade;

public class NotificationServer {
    //connect=> Connection
    //authenticate(appId, key) => AuthToken
    //send(authToken, message, target)
    //connection.disconnect()

    public Connection connect(String idAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending a message");
    }
}

