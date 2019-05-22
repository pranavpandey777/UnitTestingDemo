package com.example.testingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText area1, area2;
    Button add;
    TextView ans;
    String val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        area1 = findViewById(R.id.area1);
        area2 = findViewById(R.id.area2);
        add = findViewById(R.id.add);
        ans = findViewById(R.id.ans);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int one = Integer.valueOf(area1.getText().toString());
                int two = Integer.valueOf(area2.getText().toString());

                Addition(one, two);
                ans.setText(val);
            }
        });

    }


    public int Addition(int num1, int num2) {

        val=String.valueOf(num1+num2);

//        ans.setText(val);

        int ians=Integer.valueOf(val);
        return ians;
    }

}
