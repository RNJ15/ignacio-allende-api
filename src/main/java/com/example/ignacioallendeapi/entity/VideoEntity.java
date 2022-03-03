package com.example.ignacioallendeapi.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "video")
public class VideoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_video")
    private int id;
    @Column(name = "subtitulo_lectura")
    private String  subtitulo;
    @Column(name = "cuerpo_lectura")
    private String  lectura;
    @Column(name = "path_video")
    private String path;
    @Column(name = "codigo_qr")
    private String codigo;
    @Column(name = "id_titulo_lectura")
    private int idLectura;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getLectura() {
        return lectura;
    }

    public void setLectura(String lectura) {
        this.lectura = lectura;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdLectura() {
        return idLectura;
    }

    public void setIdLectura(int idLectura) {
        this.idLectura = idLectura;
    }
}
