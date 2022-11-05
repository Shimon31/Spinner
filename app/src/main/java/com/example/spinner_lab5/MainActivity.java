package com.example.spinner_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    String name, age,gender;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextName);
        editText2 = findViewById(R.id.editTextAge);
        spinner = findViewById(R.id.spinnerGender);



    }

    public void detailsButton(View view) {

        name = editText1.getText().toString();
        age = editText2.getText().toString();
        gender = spinner.getSelectedItem().toString();



        Toast.makeText(this, "Name is : "+name+ "\nAge is : "+age+ "\nGender :"+gender, Toast.LENGTH_SHORT).show();
    }
}