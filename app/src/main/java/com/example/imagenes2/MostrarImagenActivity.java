package com.example.imagenes2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MostrarImagenActivity extends AppCompatActivity {
    ImageView imgMostrar;
    Button btnMostrar;
    int idImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_imagen);

        imgMostrar = findViewById(R.id.imgMostrar);
        btnMostrar = findViewById(R.id.btnMostrar);

        idImage = 0;

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(idImage == 0){
                    imgMostrar.setImageBitmap(Datos.listaImagenes.get(0));
                    idImage = 1;
                }else{
                    imgMostrar.setImageBitmap(Datos.listaImagenes.get(1));
                    idImage = 0;
                }
            }
        });
    }
    }
