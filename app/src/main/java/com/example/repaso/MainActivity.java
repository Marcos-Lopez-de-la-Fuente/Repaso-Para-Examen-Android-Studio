package com.example.repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout textFieldEmail;
    TextInputLayout textFieldPassword;
    Button buttonMain;


    MaterialCheckBox materialCheckedBoxMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.textFieldEmail = this.findViewById(R.id.textFieldEmail);
        this.textFieldPassword = this.findViewById(R.id.textFieldPassword);
        this.buttonMain = this.findViewById(R.id.buttonMain);


        this.materialCheckedBoxMain = this.findViewById(R.id.materialCheckedBoxMain);


        this.buttonMain.setOnClickListener(view -> {

            // Importante utilizar "getEditText()" ya que el "TextInputLayout" no tiene texto, es un Layout
            Toast.makeText(this, this.textFieldEmail.getEditText().getText() + "   |   " + this.textFieldPassword.getEditText().getText(), Toast.LENGTH_SHORT).show();
            
        });


        // Listener para cuando se pulsan los MaterialCheckBox
        this.materialCheckedBoxMain.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    Toast.makeText(MainActivity.this, "El MaterialCheckBox está encendido", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "El MaterialCheckBox está apagado", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}