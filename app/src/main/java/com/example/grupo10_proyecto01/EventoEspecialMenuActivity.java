package com.example.grupo10_proyecto01;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EventoEspecialMenuActivity extends ListActivity {

    String[] menu = {"Crear evento especial", "Actualizar evento especial", "Ver detalle evento especial"};
    String[] activities = {"EventoEspecialInsertarActivity","EventoEspecialActualizarActivity","EventoEspecialDetalleActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);
        String nombreValue = activities[position];

        try {
            Class<?> clase = Class.forName("com.example.grupo10_proyecto01."+nombreValue);
            Intent inte = new Intent(this,clase);
            this.startActivity(inte);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}