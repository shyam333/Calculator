package helloworld.demo.com.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, button10, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual;
    EditText edt1;
    TextView textView;
    String s1, s2, s3, s4, str;
    Double mValueOne, mValueTwo;
    boolean mAddition, mSubtract, mMultiplication, mDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SETTING BUTTON ID
        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        button10 = (Button) findViewById(R.id.btn10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        // textView = (TextView) findViewById(R.id.txt1);
        //EDIT TEXT ID
        edt1 = (EditText) findViewById(R.id.edt1);
        //SET LISTENER
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
                // edt1.getText();
                // edt1.setText("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });
        //ADDITION
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    s1 = (edt1.getText() + "");
                    mValueOne = Double.parseDouble(s1);
                    mAddition = true;
                    //edt1.setText(s1);
                    edt1.setText(null);
                }
            }
        });
        //SUBRACTION
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2 = (edt1.getText() + "");
                mValueOne = Double.parseDouble(s2);
                mSubtract = true;
                //  edt1.setText("-");
                edt1.setText(null);
            }
        });
        //MULTIPLICATION
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //GETTING VALUE 1
                s3 = (edt1.getText() + "");
                mValueOne = Double.parseDouble(s3);
                mMultiplication = true;
                edt1.setText(null);
                //edt1.setText(edt1.getText() + "*");
            }
        });
        //DIVISION
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s4 = (edt1.getText() + "");
                mValueOne = Double.parseDouble(s4);
                mDivision = true;
                edt1.setText(null);
            }
        });
        //EQUALS
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //GETTING VALUE 2
                str = (edt1.getText() + "");
                mValueTwo = Double.parseDouble(str);
                if (mAddition == true) {
                    edt1.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }
                if (mSubtract == true) {
                    edt1.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }
                if (mMultiplication == true) {
                    edt1.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }
                if (mDivision == true) {
                    edt1.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });
        //CLEAR
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });
        //DOT
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + ".");
            }
        });
    }
}
