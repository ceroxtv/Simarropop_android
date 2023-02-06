package com.example.simarropop.pojos;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable {
   private String titulo;
   private String precio;
   private ArrayList<Producto> listaProductos;


    public Producto(String titulo, String precio, ArrayList<Producto> listaProductos) {
        this.titulo = titulo;
        this.precio = precio;
        this.listaProductos = listaProductos;
    }
    public Producto(String titulo, String precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
