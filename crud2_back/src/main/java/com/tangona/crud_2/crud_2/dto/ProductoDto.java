package com.tangona.crud_2.crud_2.dto;

import org.springframework.lang.NonNull;

import javax.persistence.DiscriminatorValue;

public class ProductoDto {

    @NonNull
    private String nombre;

    private Float precio;

    public ProductoDto(@NonNull String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public ProductoDto() {
    }



    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}

