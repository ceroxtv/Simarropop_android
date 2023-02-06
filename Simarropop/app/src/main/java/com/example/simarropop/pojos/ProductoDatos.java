package com.example.simarropop.pojos;

import java.util.ArrayList;

public class ProductoDatos {
    public static ArrayList <Producto> PRODUCTOS = new ArrayList<>();
    static{
        PRODUCTOS.add(new Producto("Coche","100$"));
        PRODUCTOS.add(new Producto("Moto","200$"));
        PRODUCTOS.add(new Producto("PC","150$"));
        PRODUCTOS.add(new Producto("Esponja","300$"));
        PRODUCTOS.add(new Producto("Alcachofa","500$"));
        PRODUCTOS.add(new Producto("Television","100$"));


    }
}
