package com.example.myapp_fibo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1=(TextView) findViewById(R.id.text2);
        EditText et=(EditText) findViewById(R.id.num);
        Button b=(Button) findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=0,n2=1,n3=1,num;
                num=Integer.parseInt(et.getText().toString().trim());

                t1.setText(n1);
                t1.setText(n2);
                for(int i=2;i<num;++i)
                {
                    n3=n1+n2;
                    t1.setText(n3);
                    n1=n2;
                    n2=n3;
                }
            }
        });
    }
}