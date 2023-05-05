package com.example.grupo10_proyecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class EventoEspecialActualizarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento_especial_actualizar);
        initSpinner();
    }
    public void initSpinner(){
        Spinner spinnerHorario = (Spinner) findViewById(R.id.spinnerHorarioActualizarEventoEspecial);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.spinnerHorariosEventoEspecial, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHorario.setAdapter(adapter);
    }
}