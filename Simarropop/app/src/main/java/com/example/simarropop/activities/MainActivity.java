package com.example.simarropop.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.simarropop.R;
import com.example.simarropop.pojos.CategoriaDatos;
import com.example.simarropop.pojos.CategoriasAdapter;
import com.example.simarropop.pojos.Producto;
import com.example.simarropop.pojos.ProductoAdapter;
import com.example.simarropop.pojos.ProductoDatos;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler,recyclerHZ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Producto> productos = new ArrayList<>();
        productos = ProductoDatos.PRODUCTOS;
        System.out.println(productos);
        CategoriasAdapter categoriasAdapter = new CategoriasAdapter(CategoriaDatos.CATEGORIAS);

        ProductoAdapter adapter = new ProductoAdapter(productos);
        recycler = findViewById(R.id.recyclerProductos);
        recycler.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
        recyclerHZ = findViewById(R.id.recyclerCategorias);
        recyclerHZ.setHasFixedSize(true);
        LinearLayoutManager layoutHZ = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerHZ.setLayoutManager(layoutHZ);
        recyclerHZ.setAdapter(categoriasAdapter);
    }
}