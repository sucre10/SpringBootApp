package com.example.SpringBootApp.security.payload;

/**
 * El paquete PAYLOAD sera paa logearse, registrarse, etc....
 * se utilizan con los controladores (res)
 */
public class LoginRequest {
    private String username;
    private String password;

    public LoginRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
