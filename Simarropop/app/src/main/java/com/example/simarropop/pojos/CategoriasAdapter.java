package com.example.simarropop.pojos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simarropop.R;

import java.util.ArrayList;

public class CategoriasAdapter extends RecyclerView.Adapter<CategoriasAdapter.ViewHolderDatos>{


    ArrayList<Categoria> listaCategorias;

    // Propiedad para el onClick
    private View.OnClickListener listener;

    // Este es nuestro constructor (puede variar según lo que queremos mostrar)
    public CategoriasAdapter(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    // El layout manager invoca este método
    // para renderizar cada elemento del RecyclerView
    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Creamos una nueva vista
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.categoria_item, null, false);

        // Para que cada ítem ocupe el match_parent
        RecyclerView.LayoutParams lp =
                new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);

        // Para realizar onClick

        return new ViewHolderDatos(view);
    }

    // Este método asigna valores para cada elemento de la lista
    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        // - obtenemos un elemento del dataset según su posición
        // - reemplazamos el contenido usando tales datos
        holder.asignarDatos(listaCategorias.get(position));

    }

    // Método que define la cantidad de elementos del RecyclerView
    // Puede ser más complejo (por ejem, si implementamos filtros o búsquedas)
    @Override
    public int getItemCount() {
        return listaCategorias.size();
    }

    // Para realizar onClick


    // Para realizar onClick


    // Obtener referencias de los componentes visuales para cada elemento
    // Es decir, referencias de los EditText, TextViews, Buttons
    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        // en este ejemplo cada elemento consta solo de un título y subtítulo
        TextView titulo;
        ImageView img_prod1;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            img_prod1= itemView.findViewById(R.id.img_seccion);
            titulo = itemView.findViewById(R.id.ed_seccion);
        }

        public void asignarDatos(Categoria categoria) {
            img_prod1.setImageResource(R.drawable.fordfiesta);
            titulo.setText(categoria.getTitulo());


        }
    }
}

