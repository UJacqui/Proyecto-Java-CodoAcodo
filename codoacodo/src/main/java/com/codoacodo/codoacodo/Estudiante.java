package com.codoacodo.codoacodo;


import jakarta.persistence.*;

@Entity
@Table(name = "Estudiante")
public class Estudiante {
    private int id_persona;
    private String nombre;
    private String apellido;
    private int edad;


    public Estudiante(int id_persona, String nombre, String apellido, int edad) {

    }

    public Estudiante() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
