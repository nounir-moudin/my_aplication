package ner.mon.nitx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        txt=findViewById(R.id.textView);
        b4=findViewById(R.id.b4);
        b1.setVisibility(View.GONE);
        txt.setVisibility(View.VISIBLE);
        b2.setVisibility(View.GONE);
        b3.setVisibility(View.GONE);
        b4.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                openform1();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                openform2();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                openform3();
            }
        });
        new  Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                txt.setVisibility(View.GONE);

            }
        },3000);
    }



    public void openform1(){

        Intent t = new Intent(this,book1.class);
        startActivity(t);
    }
    public void openform2(){

        Intent t = new Intent(this,book2.class);
        startActivity(t);
    }
    public void openform3(){

        Intent t = new Intent(this,book3.class);
        startActivity(t);
    }
}