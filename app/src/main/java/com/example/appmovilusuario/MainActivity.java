package com.example.appmovilusuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btEnviar(View view){
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, mainSaludo.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        EditText txtFechaNac = (EditText)findViewById(R.id.txtFecha);
        RadioButton rbtMasculino = (RadioButton) findViewById(R.id.rbtMasculino);
        RadioButton rbtFemenino = (RadioButton) findViewById(R.id.rbtFemenino);
        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("TELEFONO", txtTelefono.getText().toString());
        b.putString("FECHANAC", txtFechaNac.getText().toString());
        if(rbtFemenino.isChecked()){
            b.putString("GENERO", "Femenino");
        }
        else{
            b.putString("GENERO", "Masculino");
        }
        //Añadimos la información al intent
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }
}