package com.unal.firebase.management.models;

import lombok.Data;

@Data
public class almacenamiento {

    private int id;
    private int capacidad;
    private String marca;
    private String nombre;
    private int precio;
    private String tipo;
    private int velEscritura;
    private int velLectura;

    
}
