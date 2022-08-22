package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t2 = findViewById(R.id.textView2);
        TextView t3 = findViewById(R.id.textView);
        TextView t4 = findViewById(R.id.textView4);
        TextView customerNameT1 = findViewById(R.id.customerName);
        TextView ageT2 = findViewById(R.id.age);
        TextView jobT3 = findViewById(R.id.customerJob);
        TextView emailT4 = findViewById(R.id.customerEmail);
        TextView phoneT5 = findViewById(R.id.customerNumber);
        TextView t5 = findViewById(R.id.textView5);
        TextView t6 = findViewById(R.id.textView6);
        Bundle bundle = getIntent().getExtras();


        // الهاتف
        int phone = bundle.getInt("phone");
        phoneT5.setText(String.valueOf(phone));

        // email
        String Email = bundle.getString("Email");
        emailT4.setText(Email);

        // job
        String job = bundle.getString("job");
        jobT3.setText(job);

        // name
        String name = bundle.getString("name");
        customerNameT1.setText(name);

        // age
        int age = bundle.getInt("age");
        ageT2.setText(String.valueOf(age));

        phoneT5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+phone));
                startActivity(intent);
            }
        });

        }

    }
