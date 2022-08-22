package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.Name);
        EditText age = findViewById(R.id.Age);
        EditText job = findViewById(R.id.Job);
        EditText Email = findViewById(R.id.Email);
        EditText phone = findViewById(R.id.Phone);
        ImageButton next = findViewById(R.id.imageButton2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name =name.getText().toString();
                int Age = Integer.parseInt(age.getText().toString());
                String Job =job.getText().toString();
                int Phone = Integer.parseInt(phone.getText().toString());
                String email = Email.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", Name);
                intent.putExtra("age", Age);
                intent.putExtra("job", Job);
                intent.putExtra("Email", email);
                intent.putExtra("phone", Phone);

                startActivity(intent);
            }
        });
    }
}