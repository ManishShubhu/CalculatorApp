package com.e.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,
            btnSum,btnSub,btnMul,btnDiv,btnRes,btnC;
    private EditText etResult;

    float ValueOne, ValueTwo;
    boolean Addition, Subtract, Multiplication, Division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnZero= findViewById(R.id.btnZero);
        btnOne= findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree= findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive= findViewById(R.id.btnFive);
        btnSix= findViewById(R.id.btnSix);
        btnSeven= findViewById(R.id.btnSeven);
        btnEight= findViewById(R.id.btnEight);
        btnNine= findViewById(R.id.btnNine);
        btnSum= findViewById(R.id.btnAdd);
        btnSub= findViewById(R.id.btnSub);
        btnMul= findViewById(R.id.btnMul);
        btnDiv= findViewById(R.id.btnDivide);
        btnC= findViewById(R.id.btnAc);
        btnRes= findViewById(R.id.btnRes);
        etResult= findViewById(R.id.etResult);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "2");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + "0");
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etResult == null) {
                    etResult.setText("");
                } else {
                    ValueOne = Float.parseFloat(etResult.getText() + "");
                    Addition = true;
                    etResult.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(etResult.getText() + "");
                Subtract = true;
                etResult.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(etResult.getText() + "");
                Multiplication = true;
                etResult.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(etResult.getText() + "");
                Division = true;
                etResult.setText(null);
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueTwo = Float.parseFloat(etResult.getText() + "");

                if (Addition == true) {
                    etResult.setText(ValueOne + ValueTwo + "");
                    Addition = false;
                }

                if (Subtract == true) {
                    etResult.setText(ValueOne - ValueTwo + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    etResult.setText(ValueOne * ValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    etResult.setText(ValueOne / ValueTwo + "");
                    Division = false;
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText("");
            }
        });
    }
}
