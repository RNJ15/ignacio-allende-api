package com.example.ignacioallendeapi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="titulo")
public class TituloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_titulo_lectura")
    private int id_titulo_lectura;
    @Column(name = "titulo_lectura")
    private String titulo_lectura;
    @Column(name = "portada")
    private String portada;


    public int getId_titulo_lectura() {
        return id_titulo_lectura;
    }

    public void setId_titulo_lectura(int id_titulo_lectura) {
        this.id_titulo_lectura = id_titulo_lectura;
    }

    public String getTitulo_lectura() {
        return titulo_lectura;
    }

    public void setTitulo_lectura(String titulo_lectura) {
        this.titulo_lectura = titulo_lectura;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }
}
