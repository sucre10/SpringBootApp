package com.example.SpringBootApp.security.payload;

/**
 * El paquete PAYLOAD sera paa logearse, registrarse, etc....
 * se utilizan con los controladores (res)
 */
public class MessageResponse {
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
