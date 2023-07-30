package com.example.example_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class SecondActivity extends AppCompatActivity {
    private TextView infoTicket;
    private Button  btFixTicket,btNewTicket;
    private Ticket ticket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        infoTicket = findViewById(R.id.infoTicket);
        btNewTicket = findViewById(R.id.btNewTicket);
        btFixTicket = findViewById(R.id.btFixTicket);
        Bundle bundleTicket = getIntent().getExtras();
        if (bundleTicket != null){
            ticket = (Ticket) bundleTicket.getSerializable(Ticket.class.getSimpleName());
            infoTicket.setText(ticket.toString());
        }
        btFixTicket.setOnClickListener(listener);
        btNewTicket.setOnClickListener(listener);
    }
    private View.OnClickListener listener = view -> {
        switch (view.getId()){
            case R.id.btNewTicket:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.btFixTicket:
                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                intent2.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent2);
                break;
        }
    };
}
