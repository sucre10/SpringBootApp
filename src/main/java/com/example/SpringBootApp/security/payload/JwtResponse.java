package com.example.SpringBootApp.security.payload;

/**
 * El paquete PAYLOAD sera paa logearse, registrarse, etc....
 * se utilizan con los controladores (res)
 */
public class JwtResponse {
    //propedades
    private String token;

    //constructores
    public JwtResponse() {
    }
    public JwtResponse(String token) {
        this.token = token;
    }

    //getterand setter:
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
