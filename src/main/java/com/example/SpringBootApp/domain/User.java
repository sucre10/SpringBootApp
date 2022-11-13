package com.example.SpringBootApp.domain;

import javax.persistence.*;

@Entity     //@Entity: usa entidades para reconocer cuales clases representan el modelo de datos
@Table(name="app_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //genera id automaticamente
    private Long id;

    private String username;

    private String email;

    private String password;


    public User() {}

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * La anotación @Override indica que el método de la clase secundaria está sobrescribiendo
     * su método de la clase base. Extrae una advertencia del compilador si el método anotado en
     * realidad no anula nada. Puede mejorar la legibilidad del código fuente.
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
    }
}
