package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,plus,minus,mult,div,dot,enter_btn,equal_btn,clear,mod;
    TextView textView;
    EditText displayText;
    float res1;
    Boolean add,sub,divs,multp,mods;

    void storePrevious()
    {
       res1=Float.parseFloat(displayText.getText()+" ");
    }
    void setFalse()
    {
        add=sub=divs=multp=mods=false;
    }
    void clear()
    {
        res1= 0;
        displayText.setText(null);
        setFalse();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        dot=findViewById(R.id.dot);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        div=findViewById(R.id.div);
        mod=findViewById(R.id.mod);
        mult=findViewById(R.id.mult);
        enter_btn=findViewById(R.id.enter_btn);
        equal_btn=findViewById(R.id.equal_btn);
        clear=findViewById(R.id.clear);
        textView=findViewById(R.id.textView);
        displayText=findViewById(R.id.displayText);

        btn1.setOnClickListener(v -> displayText.setText(displayText.getText()+"1"));
        btn2.setOnClickListener(v -> displayText.setText(displayText.getText()+"2"));
        btn3.setOnClickListener(v -> displayText.setText(displayText.getText()+"3"));
        btn4.setOnClickListener(v -> displayText.setText(displayText.getText()+"4"));
        btn5.setOnClickListener(v -> displayText.setText(displayText.getText()+"5"));
        btn6.setOnClickListener(v -> displayText.setText(displayText.getText()+"6"));
        btn7.setOnClickListener(v -> displayText.setText(displayText.getText()+"7"));
        btn8.setOnClickListener(v -> displayText.setText(displayText.getText()+"8"));
        btn9.setOnClickListener(v -> displayText.setText(displayText.getText()+"9"));
        btn10.setOnClickListener(v -> displayText.setText(displayText.getText()+"0"));
        dot.setOnClickListener(v -> displayText.setText(displayText.getText()+"."));

        //Arithmatic Opperations
            plus.setOnClickListener(v -> {
                if (displayText==null)
                {
                    displayText.setText(" ");
                }
                else {
                    storePrevious();
                    setFalse();
                    add=true;
                    displayText.setText(null);//to store null value after complition of opperation
                }
            });
        minus.setOnClickListener(v -> {
            if (displayText==null)
            {
                displayText.setText(" ");
            }
            else {
                storePrevious();
                setFalse();
                sub=true;
                displayText.setText(null);
            }
        });
        mult.setOnClickListener(v -> {
            if (displayText==null)
            {
                displayText.setText(" ");
            }
            else {
                storePrevious();
                setFalse();
                multp=true;
                displayText.setText(null);
            }
        });
        div.setOnClickListener(v -> {
            if (displayText==null)
            {
                displayText.setText(" ");
            }
            else {
                storePrevious();
                setFalse();
                divs=true;
                displayText.setText(null);
            }
        });
        mod.setOnClickListener(v -> {
            if (displayText==null)
            {
                displayText.setText(" ");
            }
            else {
                storePrevious();
                setFalse();
                mods=true;
                displayText.setText(null);
            }
        });

        equal_btn.setOnClickListener(v -> {
            if (add)
            {
                displayText.setText(res1+Float.parseFloat(displayText.getText()+" ")+"");
            }
            if (sub)
            {
                displayText.setText(res1 -Float.parseFloat(displayText.getText()+" ")+"");
            }
            if (multp)
            {
                displayText.setText(res1*Float.parseFloat(displayText.getText()+" ")+"");
            }
            if (divs)
            {
                displayText.setText(res1/Float.parseFloat(displayText.getText()+" ")+"");
            } if (mods)
            {
                displayText.setText(res1%Float.parseFloat(displayText.getText()+" ")+"");
            }



        });
        clear.setOnClickListener(v -> clear());






    }
}