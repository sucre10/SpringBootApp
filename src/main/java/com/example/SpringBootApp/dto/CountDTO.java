package com.example.SpringBootApp.dto;

/**
 * Data transfer Object
 */

/**
 * El objetivo de esta clase es devolver datos al fronted(cliente)
 * no tienen ninguna complejidad
 */
public class CountDTO {
    //propiedades
    private Long count;
    private String message;

    public CountDTO() {
    }

    //constructor
    public CountDTO(Long count) {
        this.count = count;
    }

    //getter and setter
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
