package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultText;
    private enum Operator {none, add, sub, mul, div, eq}

    private double data01=0, data02 = 0;

    private Operator opp = Operator.none;

    private boolean hasDot = false;

    private boolean requiresCleaning = false;

    private boolean toDivide = false;
    private boolean toMultiply = false;
    private boolean toSubtract = false;
    private boolean toAdd = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = (TextView)findViewById(R.id.resultText);

    }

    // Sample implementation of the onClickNumericalButton (...).
    // Feel free to re-implement or modidy.
    public void onClickNumericalButton(View view) {


        //Getting ID of pressed Button
        int pressID = view.getId();

        //If we had an equal sign pressed last, standard operation is to clean
        if (opp == Operator.eq) {
            opp = Operator.none;
            resultText.setText("");
        }

        if (requiresCleaning) {
            requiresCleaning = false;
            hasDot = false;
            resultText.setText("");
        }

        //Figuring out which button was pressed and updating the represented text field object
        if (pressID == R.id.button0) {
            resultText.setText(resultText.getText() + "0");
        } else if (pressID == R.id.button1) {
            resultText.setText(resultText.getText() + "1");
        } else if (pressID == R.id.button2) {
            resultText.setText(resultText.getText() + "2");
        } else if (pressID == R.id.button3) {
            resultText.setText(resultText.getText() + "3");
        } else if (pressID == R.id.button4) {
            resultText.setText(resultText.getText() + "4");
        } else if (pressID == R.id.button5) {
            resultText.setText(resultText.getText() + "5");
        } else if (pressID == R.id.button6) {
            resultText.setText(resultText.getText() + "6");
        } else if (pressID == R.id.button7) {
            resultText.setText(resultText.getText() + "7");
        } else if (pressID == R.id.button8) {
            resultText.setText(resultText.getText() + "8");
        } else if (pressID == R.id.button9) {
            resultText.setText(resultText.getText() + "9");
        } else if (pressID == R.id.buttonDot) {
            if (!hasDot) {
                resultText.setText(resultText.getText() + ".");
                hasDot = true;
            }
        } else {
            resultText.setText("ERROR");
        }

    }

    public void onClickFunctionButton(View view) {
        //Getting ID of pressed Button
        int pressID = view.getId();

        if (pressID == R.id.buttonDiv) {
            toDivide = true;
            toMultiply = false;
            toSubtract = false;
            toAdd = false;
            if (data01 == 0 && !resultText.getText().toString().equals("")) {
                data01 = Double.parseDouble(resultText.getText().toString());
            }
            resultText.setText("");
            view.setBackgroundColor(Color.rgb(224,79,233));
        } else if (pressID == R.id.buttonMul) {
            toDivide = false;
            toMultiply = true;
            toSubtract = false;
            toAdd = false;
            if (data01 == 0 && !resultText.getText().toString().equals("")) {
                data01 = Double.parseDouble(resultText.getText().toString());
            }
            resultText.setText("");
            view.setBackgroundColor(Color.rgb(224,79,233));
        } else if (pressID == R.id.buttonMinus) {
            toDivide = false;
            toMultiply = false;
            toSubtract = true;
            toAdd = false;
            if (data01 == 0 && !resultText.getText().toString().equals("")) {
                data01 = Double.parseDouble(resultText.getText().toString());
            }
            resultText.setText("");
            view.setBackgroundColor(Color.rgb(224,79,233));
        } else if (pressID == R.id.buttonPlus) {
            toDivide = false;
            toMultiply = false;
            toSubtract = false;
            toAdd = true;
            if (data01 == 0 && !resultText.getText().toString().equals("")) {
                data01 = Double.parseDouble(resultText.getText().toString());
            }
            resultText.setText("");
            view.setBackgroundColor(Color.rgb(224,79,233));
        } else if (pressID == R.id.buttonEq) {
            if(!resultText.getText().toString().equals("")){
                data02 = Double.parseDouble(resultText.getText().toString());
                if(toDivide){
                    double result = data01 / data02;
                    resultText.setText(String.valueOf(result));
                } else if (toMultiply) {
                    double result = data01 * data02;
                    resultText.setText(String.valueOf(result));
                } else if (toSubtract) {
                    double result = data01 - data02;
                    resultText.setText(String.valueOf(result));
                } else if (toAdd) {
                    double result = data01 + data02;
                    resultText.setText(String.valueOf(result));
                }
            } else {
                resultText.setText("ERROR");
            }
        }
    }

}