package com.example.shadow.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    //Declaring the variable of class EditText, TextView, and Button
    EditText num1,num2;
    TextView sol;
    Button sum,sub,prod,div;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigning the values to the variables
        num1=findViewById(R.id.etnum1);
        num2=findViewById(R.id.etnum2);
        sol=findViewById(R.id.tvsol);
        sum=findViewById(R.id.btnsum);
        sub=findViewById(R.id.btnsub);
        prod=findViewById(R.id.btnprod);
        div=findViewById(R.id.btndiv);

        sum.setOnClickListener(this);
        sub.setOnClickListener(this);
        prod.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    // Setting onclicklistener based on different switch-case statements
    @Override
    public void onClick(View view)
    {
        int fst,sec,ans;
        fst=Integer.parseInt(num1.getText().toString());
        sec=Integer.parseInt(num2.getText().toString());
        switch(view.getId())
        {
            case R.id.btnsum:
                 ans=fst+sec;
                 break;
            case R.id.btnsub:
                 ans=fst-sec;
                 break;
            case R.id.btnprod:
                 ans=fst*sec;
                 break;
            case R.id.btndiv:
                 if(sec!=0)
                    ans=fst/sec;
                 else
                     ans=0;
                 break;
            default:
                 ans=0;
                 break;
        }
        sol.setText("Ans: "+ans);
    }
}