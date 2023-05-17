package sg.edu.rp.c346.id22011555.module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView C203;
    TextView C206;
    TextView C218;
    TextView C235;
    TextView C346;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C203=findViewById(R.id.ClassC203);
        C206=findViewById(R.id.ClassC206);
        C218=findViewById(R.id.ClassC218);
        C235=findViewById(R.id.ClassC235);
        C346=findViewById(R.id.ClassC346);

        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("code", "203");
                intent.putExtra("name", "Web App ln Development in php");
                intent.putExtra("year", "2023");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "W65D");

                startActivity(intent);

            }
        });

        C206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("code", "206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("year", "2023");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "W65D");
                startActivity(intent);
            }
        });

        C218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("code", "218");
                intent.putExtra("name", "UI/UX Design for Apps");
                intent.putExtra("year", "2023");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "W65D");
                startActivity(intent);
            }
        });

        C235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("code", "235");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("year", "2023");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "W65D");
                startActivity(intent);
            }
        });

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("code", "346");
                intent.putExtra("name", "Mobile App Development");
                intent.putExtra("year", "2023");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E63A");
                startActivity(intent);
            }
        });

    }
}