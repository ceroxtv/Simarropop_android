package com.example.simarropop.pojos;

import java.io.Serializable;
import java.util.ArrayList;

public class CategoriaDatos implements Serializable {
    public static ArrayList<Categoria> CATEGORIAS = new ArrayList<>();
    static{
        CATEGORIAS.add(new Categoria("Coche"));
        CATEGORIAS.add(new Categoria("Moto"));
        CATEGORIAS.add(new Categoria("Informatica"));
        CATEGORIAS.add(new Categoria("Limpieza"));
        CATEGORIAS.add(new Categoria("Moda"));
        CATEGORIAS.add(new Categoria("Deportes"));


    }

}
