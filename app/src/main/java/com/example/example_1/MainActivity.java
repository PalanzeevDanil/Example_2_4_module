package com.example.example_1;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edId, edDeparturePointIn,time,time2,arrival;
    TextView costIn;
    Button button;
    private int id;
    private Float cost = 360.99f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edId = findViewById(R.id.id);
        edDeparturePointIn = findViewById(R.id.departure);
        time = findViewById(R.id.time);
        time2 = findViewById(R.id.time2);
        arrival = findViewById(R.id.arrival);
        button = findViewById(R.id.button);
        costIn = findViewById(R.id.costIn);
        costIn.setText("Стоимость билета"+ cost + "фунтов");
        button.setOnClickListener(listener);}
    private View.OnClickListener listener = v -> {
        id = Integer.parseInt(edId.getText().toString());
        Ticket ticket = new Ticket(id,
                edDeparturePointIn.getText().toString(),
                time.getText().toString(),
                arrival.getText().toString(),
                time2.getText().toString(),
                cost);

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra(Ticket.class.getSimpleName(), ticket);
        startActivity(intent);
    };
}