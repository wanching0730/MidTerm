package com.wanching.midterm;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button btnDate;
    private Button btnTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colourArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                switch(position)
                {
                    case 0:
                        Toast.makeText(getApplicationContext(), "blue!", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "green!", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "red!", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnDate = (Button) findViewById(R.id.date_selection);
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment fragment = new DatePickerFragment();
                fragment.show(getSupportFragmentManager(), "date picker");

            }
        });

        btnTime = (Button) findViewById(R.id.time_selection);
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment fragment = new TimePickerFragment();
                fragment.show(getSupportFragmentManager(), "time picker");
            }
        });



    }

    public void foodSelection(View view){
        boolean choice = ((RadioButton) view).isChecked();

        switch(view.getId())
        {
            case R.id.burger:
                if(choice)
                    Toast.makeText(getApplicationContext(), "burger!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fries:
                if(choice)
                    Toast.makeText(getApplicationContext(), "fries!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pizza:
                if(choice)
                    Toast.makeText(getApplicationContext(), "pizza!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void fruitSelection(View view){
        boolean choice = ((CheckBox)view).isChecked();

        switch(view.getId())
        {
            case R.id.lemon:
                if(choice)
                    Toast.makeText(getApplicationContext(), "lemon", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "unselected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.orange:
                if(choice)
                    Toast.makeText(getApplicationContext(), "orange", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "unselected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.grape:
                if(choice)
                    Toast.makeText(getApplicationContext(), "grape", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "unselected", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
