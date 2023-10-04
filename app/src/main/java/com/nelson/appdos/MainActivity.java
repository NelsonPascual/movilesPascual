package com.nelson.appdos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.microedition.khronos.egl.EGLSurface;

public class MainActivity extends AppCompatActivity {

    EditText estudiantes,notaUno,notaDos,notaTres, notaCuatro;
    TextView cantidadEstud, cantidadEstudinatesIngresados;

    int cantidadEstudiantes;
    CheckBox totalNotas,totalEstudiantes;

    Button calcularTotalNotasAlumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estudiantes = findViewById(R.id.studentsQuantity);
        notaUno= findViewById(R.id.gradeUno);
        notaDos = findViewById(R.id.gradeDos);
        notaTres = findViewById(R.id.gradeTres);
        notaCuatro = findViewById(R.id.gradeCuatro);
        totalNotas = findViewById(R.id.totalIngresado);
        totalEstudiantes = findViewById(R.id.guardarCantidadEstudiantes);
        cantidadEstud = findViewById(R.id.cantidadEstudiantes);
        cantidadEstudinatesIngresados = findViewById(R.id.tvControl);
        calcularTotalNotasAlumnos = findViewById(R.id.ingresarDatos);
        calcularTotalNotasAlumnos.setActivated(false);

        totalEstudiantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = ((CheckBox) view).isChecked();

                if (checked && (estudiantes.getText().toString().matches("[0-9]*"))){
                    cantidadEstudiantes = Integer.parseInt(estudiantes.getText().toString());
                    cantidadEstud.setVisibility(View.GONE);
                    estudiantes.setVisibility(View.GONE);
                    totalEstudiantes.setVisibility(View.GONE);


                }else{
                    Toast.makeText(MainActivity.this, "Dato ingresado no es un número", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}