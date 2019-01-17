package com.grayrav.p0101_listener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button1;
    Button button2;
    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button1:
                        textView.setText(R.string.tex1);
                        break;

                    case R.id.button2:
                        textView.setText(R.string.tex2);
                        break;

                    case R.id.button3:
                        textView.setText(R.string.tex3);
                        break;
                }
            }
        };

        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setText(R.string.buttonEx);
                button3.setText(R.string.buttonEx);
            }
        });
    }
}
