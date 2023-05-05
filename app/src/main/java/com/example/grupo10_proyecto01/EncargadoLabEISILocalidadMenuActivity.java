package com.example.grupo10_proyecto01;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EncargadoLabEISILocalidadMenuActivity extends ListActivity{
    String[] menu={"LCOMP01", "LCOMP02", "LCOMP03","LCOMP04", "LCOMP05"};
    //String[] activities={"EncargadoLabEISIPropuestasEspecificasActivity"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_encargado_lab_eisilocalidad_menu);
        ListView listView = getListView();
        listView.setBackgroundColor(Color.parseColor("#eae2cf"));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, menu);
        setListAdapter(adapter);
    }

   /* protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        l.getChildAt(position).setBackgroundColor(Color.parseColor("#26979f"));
        l.getChildAt(4).setBackgroundColor(Color.parseColor("#e84d5b"));

        try {
            Class<?> clase = Class.forName("com.example.grupo10_proyecto01." + nombreValue);
            Intent inte = new Intent(this, clase);
            this.startActivity(inte);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }*/
}