package com.example.likev.sbu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText date = (EditText) findViewById(R.id.date);
        final EditText start = (EditText) findViewById(R.id.start);
        final EditText end = (EditText) findViewById(R.id.end);
        final EditText host = (EditText) findViewById(R.id.host);
        final EditText description = (EditText) findViewById(R.id.description);
        Button submit = (Button) findViewById(R.id.submit);
        Button back = (Button) findViewById(R.id.back);
        final Intent intent = new Intent(this,Home.class);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Event temp = new Event(name.getText().toString(),
                        host.getText().toString(), description.getText().toString(),
                        date.getText().toString(),
                        Integer.parseInt(start.getText().toString()),
                        Integer.parseInt(end.getText().toString()));
                EventManager.Events.add(temp);
            }
        });

    }

}
