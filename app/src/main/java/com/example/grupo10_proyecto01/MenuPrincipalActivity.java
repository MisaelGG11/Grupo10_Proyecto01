package com.example.grupo10_proyecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuPrincipalActivity extends AppCompatActivity {

    Button logout;
    ListView menuPrincipal;
    TextView usuario;
    private ArrayAdapter<String> lvAdpter;

    String rol = "Secretario";
    String user = "Julio Cesar";
    String[] menu={"Perfil de usuario","Gestionar propuestas generales","Gestionar propuestas de eventos", "Revisar propuestas"};
    String[] activities={"UsuarioPerfilActivity","DocenteMenuCicloActivity","UsuarioPerfilActivity","UsuarioPerfilActivity"};

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        lvAdpter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);
        menuPrincipal = findViewById(R.id.lvMenuPrincipal);
        usuario = findViewById(R.id.tvUsuario);
        logout = findViewById(R.id.btnLogout);

        menuPrincipal.setAdapter(lvAdpter);
        usuario.setText(user);
        menuPrincipal.setBackgroundColor(Color.parseColor("#eae2cf"));

        menuPrincipal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    String nombreValue=activities[position];

                    menuPrincipal.getChildAt(position).setBackgroundColor(Color.parseColor("#26979f"));

                    try{
                        Class<?> clase=Class.forName("com.example.grupo10_proyecto01."+nombreValue);
                        Intent inte = new Intent(MenuPrincipalActivity.this,clase);
                        MenuPrincipalActivity.this.startActivity(inte);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class<?> clase2=Class.forName("com.example.grupo10_proyecto01.MainActivity");
                    Intent inte2 = new Intent(MenuPrincipalActivity.this,clase2);
                    startActivity(inte2);
                }catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });

        Toast.makeText(this, "Bienvenido " + user, Toast.LENGTH_LONG).show();
    }




    /*protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);

        String nombreValue=activities[position];

        l.getChildAt(position).setBackgroundColor(Color.parseColor("#26979f"));
        l.getChildAt(4).setBackgroundColor(Color.parseColor("#e84d5b"));

        try{
            Class<?> clase=Class.forName("com.example.grupo10_proyecto01."+nombreValue);
            Intent inte = new Intent(this,clase);
            this.startActivity(inte);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }*/
}