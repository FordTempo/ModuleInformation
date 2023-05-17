package sg.edu.rp.c346.id22011555.module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView tvCode ;
    TextView tvName ;
    TextView tvYear;
    TextView tvSemester;
    TextView tvCredit;
    TextView tvVenue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        tvCode=findViewById(R.id.ModuleCodeText);
        tvName=findViewById(R.id.ModuleNameText);
        tvYear=findViewById(R.id.ModuleAcademicText);
        tvSemester=findViewById(R.id.ModuleSemesterText);
        tvCredit=findViewById(R.id.ModuleCreditText);
        tvVenue=findViewById(R.id.ModuleVenueText);


        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        tvCode.setText(": "+ code);
        String name = intentReceived.getStringExtra("name");
        tvName.setText(": "+ name);
        String year = intentReceived.getStringExtra("year");
        tvYear.setText(": "+ year);
        String semester = intentReceived.getStringExtra("semester");
        tvSemester.setText(": "+ semester);
        String credit = intentReceived.getStringExtra("credit");
        tvCredit.setText(": "+ credit);
        String venue = intentReceived.getStringExtra("venue");
        tvVenue.setText(": "+ venue);
    }
}



