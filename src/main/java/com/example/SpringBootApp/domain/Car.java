package com.example.SpringBootApp.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;

@Entity  //@Entity: usa entidades para reconocer cuales clases representan el modelo de datos
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera id automaticamente
    /**
     * @ApiModelProperty: permite controlar definiciones específicas de Swagger, como descripción (valor),
     * nombre, tipo de datos, valores de ejemplo y valores permitidos para las propiedades del modelo.
     */
    @ApiModelProperty("Clave primaria id ficticio tipo Long autoincremental")
    private Long id;

    @Column(name = "fabricante")  //@Column:Para cambiar el dato a una columna en base de datos
    private String manufacturer;
    private String model; // CONTAINS
    private Double cc;
    private Integer doors;

    private Integer year; // IN
    private LocalDate releaseDate; // BETWEEN
    private Boolean available; // True or False

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Double getCc() {
        return cc;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCc(Double cc) {
        this.cc = cc;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getYear() {
        return year;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * La anotación @Override indica que el método de la clase secundaria está sobrescribiendo
     * su método de la clase base. Extrae una advertencia del compilador si el método anotado en
     * realidad no anula nada. Puede mejorar la legibilidad del código fuente.
     */
    @Override
    public String toString() {
        return "Car [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", cc=" + cc + ", doors="
                + doors + ", year=" + year + ", releaseDate=" + releaseDate + ", available=" + available + "]";
    }
}
