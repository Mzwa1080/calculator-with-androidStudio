package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button div;
    private Button mul;
    private Button equal;
    private Button clear;
    //    private Button equal;
    private TextView info;
    private TextView results;
//    private TextView clear;
    //    Constant var
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char DIVISION = '/';
    private final char EQU = 0;


    private final char MULTIPLICATION = '*';

    private double val1 = Double.NaN;
    //    for division
    private double val2;
    //
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpView();

//        set text what should heppen when click zeroo

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Should get everythin that was there and insert with 0
                info.setText(info.getText().toString() + "0");
            }
        });


        //        set text what should heppen when click zeroo

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Should get everythin that was there and insert with 0
                info.setText(info.getText().toString() + "1");
            }
        });


        //        set text what should heppen when click zeroo

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Should get everythin that was there and insert with 0
                info.setText(info.getText().toString() + "2");
            }
        });


        //        set text what should heppen when click zeroo

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Should get everythin that was there and insert with 0
                info.setText(info.getText().toString() + "3");
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Should get everythin that was there and insert with 0
                info.setText(info.getText().toString() + "4");
            }
        });


        //        set text what should heppen when click zeroo

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Should get everythin that was there and insert with 0
                info.setText(info.getText().toString() + "5");
            }
        });


        //        set text what should heppen when click zeroo

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Should get everythin that was there and insert with 0
                info.setText(info.getText().toString() + "6");
            }
        });


        //        set text what should heppen when click zeroo

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Should get everythin that was there and insert with 0
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Should get everythin that was there and insert with 0
                info.setText(info.getText().toString() + "8");
            }
        });


        //        set text what should heppen when click zeroo

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Should get everythin that was there and insert with 0
                info.setText(info.getText().toString() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                results.setText(String.valueOf(val1) + "+");
                info.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                results.setText(String.valueOf(val1) + "-");
                info.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                results.setText(String.valueOf(val1) + "*");
                info.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                results.setText(String.valueOf(val1) + "/");
                info.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                results.setText(results.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
//          e.g 1+1= 5
                info.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info.getText().length() > 0) {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    results.setText(null);
                }
            }


        });
    };

        private void setUpView () {
            zero = findViewById(R.id.btn0);
            one = findViewById(R.id.btn1);
            two = findViewById(R.id.btn2);
            three = findViewById(R.id.btn3);
            four = findViewById(R.id.btn4);
            five = findViewById(R.id.btn5);
            six = findViewById(R.id.btn6);
            seven = findViewById(R.id.btn7);
            eight = findViewById(R.id.btn8);
            nine = findViewById(R.id.btn9);

            add = findViewById(R.id.addbtn);
            div = findViewById(R.id.divBtn);
            sub = findViewById(R.id.subBtn);
            mul = findViewById(R.id.multiBtn);
            equal = findViewById(R.id.equalBtn);
            info = findViewById((R.id.textView));
            results = findViewById(R.id.textView2);
            clear = findViewById(R.id.clearBtn);

        }

        private void compute () {
            if (!Double.isNaN(val1)) {
//    ---- 2nd number n  parseDouble is to converte the string to double data tupe
                val2 = Double.parseDouble(info.getText().toString());

                switch (ACTION) {
                    case ADDITION:
                        val1 += val2;
                        break;

                    case SUBTRACTION:
                        val1 -= val2;
                        break;

                    case MULTIPLICATION:
                        val1 *= val2;
                        break;

                    case DIVISION:
                        val1 /= val2;
                        break;

                    case EQU:
                        break;
                }

            } else {
                val1 = Double.parseDouble(info.getText().toString());
            }
        }


};