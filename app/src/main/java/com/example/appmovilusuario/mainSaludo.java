package com.example.appmovilusuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mainSaludo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_saludo);

        //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.lblSaludo);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        // Construimos el mensaje a mostrar
        txtSaludo.setText("Hola!, Bienvenido \n " + "Nombre: " + bundle.getString("NOMBRE") +"\n Género: "+ bundle.getString("GENERO")+"\n Fecha Nac: "+ bundle.getString("FECHANAC")+"\n Télefono: "+ bundle.getString("TELEFONO"));

    }
}