package com.example.grupo10_proyecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean correct = true;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correct){
                    try{
                        Class<?> clase=Class.forName("com.example.grupo10_proyecto01.MenuPrincipalActivity");
                        Intent inte = new Intent(MainActivity.this,clase);
                        startActivity(inte);
                    }catch(ClassNotFoundException e){
                        e.printStackTrace();
                    }
                }
                else {
                    Toast.makeText( MainActivity.this, "Usuario o contraseña incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}