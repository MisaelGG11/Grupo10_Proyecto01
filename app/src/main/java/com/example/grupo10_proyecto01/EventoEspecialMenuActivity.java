package com.example.grupo10_proyecto01;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class EventoEspecialMenuActivity extends ListActivity {

    //String[] menu = {"Crear evento especial","Actualizar evento especial","Detalle evento especial"};
    String[] menu = new String[3];
    String[] activities = {"EventoEspecialInsertarActivity","EventoEspecialActualizarActivity","EventoEspecialDetalleActivity"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_evento_especial_menu);
        menu[0] = getResources().getString(R.string.txtViewCrearEventoEspecial);
        menu[1] = getResources().getString(R.string.txtViewActualizarEventoEspecial);
        menu[2] = getResources().getString(R.string.txtViewDetalleEventoEspecial);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,menu));
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
