package com.example.examenpracticomejoramiento;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextLado = findViewById(R.id.editTextLado);
        Button btnCalcular = findViewById(R.id.btnCalcular);
        final TextView textViewResultado = findViewById(R.id.textViewResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener el valor del lado ingresado
                String ladoStr = editTextLado.getText().toString();

                if (!ladoStr.isEmpty()) {
                    // Convertir el valor a número
                    double lado = Double.parseDouble(ladoStr);

                    // Calcular el área del cuadrado
                    double area = lado * lado;

                    // Mostrar el resultado en el TextView
                    textViewResultado.setText("El área del cuadrado es: " + area);
                } else {
                    // Manejar el caso en que el campo esté vacío
                    textViewResultado.setText("Ingrese un valor para el lado del cuadrado");
                }
            }
        });
    }
}
