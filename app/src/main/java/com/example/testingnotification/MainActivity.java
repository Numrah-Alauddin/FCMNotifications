package com.example.testingnotification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    RadioGroup group;
    String topic;
    Button subs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group=findViewById(R.id.topics);
        subs=findViewById(R.id.subscribe);

        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseMessaging.getInstance().subscribeToTopic(topic);
                FirebaseMessaging.getInstance().subscribeToTopic(topic);

            }
        });


    }

    public void getTopic(View view) {

        boolean checked=((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.movies:{
                if (checked){
                    topic="movies";
                    break;
                }
            }
            case R.id.books: {
                if (checked) {
                    topic = "books";
                    break;
                }
            }

        }
    }
}
