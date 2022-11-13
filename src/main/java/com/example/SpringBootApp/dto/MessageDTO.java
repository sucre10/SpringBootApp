package com.example.SpringBootApp.dto;

/**
 * El objetivo de esta clase es devolver datos al fronted(cliente)
 * no tienen ninguna complejidad
 */
public class MessageDTO {
    private String message;

    public MessageDTO() {

    }

    public MessageDTO(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
