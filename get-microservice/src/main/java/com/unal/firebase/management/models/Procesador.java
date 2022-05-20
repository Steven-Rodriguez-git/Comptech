package com.unal.firebase.management.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Procesador {
    
    public String documentId;
    public int cache;
    public int consumo;
    public int frecuencia;
    public int generacion;
    public Boolean graficaIntegrada;
    public int hilos;
    public int id;
    public String marca;
    public String nombre;
    public int nucleos;
    public int precio;
    
}
