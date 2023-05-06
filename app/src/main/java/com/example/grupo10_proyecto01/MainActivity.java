package com.example.grupo10_proyecto01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean correct = true;
    Button login;

    String categoria = "Administrador";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setMessage("¿Desea iniciar este sistema?");
                alert.setCancelable(false);
                //alert.setTitle("Sex"); si se desea agregar un titulo al alertdialog
                alert.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try{
                            Class<?> clase=Class.forName("com.example.grupo10_proyecto01.MenuPrincipalActivity");
                            Intent inte = new Intent(MainActivity.this,clase);
                            startActivity(inte);

                        }catch(ClassNotFoundException e){
                            e.printStackTrace();
                        }
                    }
                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(MainActivity.this, "Tal vez mas tarde  ", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        });
    }
}