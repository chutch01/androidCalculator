package com.example.chutc_000.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.widget.AbsSeekBar;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {



    //constants
    final int ADD = 0;
    final int SUB = 1;
    final int DIV = 2;
    final int MUL = 3;


    //instance variables
    private double firstNum;
    private String firstNumString;
    private double secondNum;
    private String secondNumString;
    private boolean isFirstNum;
    private boolean reset;
    private int arithUsed;
    private String arithUsedString;

    DecimalFormat decFormat;

    //widgets
    private TextView resultView;
    private Button ACButton;
    private Button plusMinusButton;
    private Button percentButton;
    private Button divideButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button multiplyButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button minusButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button plusButton;
    private Button zeroButton;
    private Button decimalButton;
    private Button equalsButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //initiate variables
        this.firstNum = 0;
        this.firstNumString = "0";
        this.secondNum = 0;
        this.secondNumString ="0";
        this.reset = false;

        decFormat = new DecimalFormat("0.########");


        //initialize buttons

        this.resultView = (TextView) findViewById(R.id.resultView);
        this.ACButton = (Button) findViewById(R.id.ACButton);
        this.plusMinusButton = (Button) findViewById(R.id.plusMinusButton);
        this.percentButton = (Button) findViewById(R.id.percentButton);
        this.divideButton = (Button) findViewById(R.id.divideButton);
        this.sevenButton = (Button) findViewById(R.id.sevenButton);
        this.eightButton = (Button) findViewById(R.id.eightButton);
        this.nineButton = (Button) findViewById(R.id.nineButton);
        this.multiplyButton = (Button) findViewById(R.id.multiplyButton);
        this.fourButton = (Button) findViewById(R.id.fourButton);
        this.fiveButton = (Button) findViewById(R.id.fiveButton);
        this.sixButton = (Button) findViewById(R.id.sixButton);
        this.minusButton = (Button) findViewById(R.id.minusButton);
        this.oneButton = (Button) findViewById(R.id.oneButton);
        this.twoButton = (Button) findViewById(R.id.twoButton);
        this.threeButton = (Button) findViewById(R.id.threeButton);
        this.plusButton = (Button) findViewById(R.id.plusButton);
        this.zeroButton = (Button) findViewById(R.id.zeroButton);
        this.decimalButton = (Button) findViewById(R.id.decimalButton);
        this.equalsButton = (Button) findViewById(R.id.equalsButton);

        //button methods
        this.oneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum("1");
                }//if
            }//onclick
        });//setOnClickListener
        this.twoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum("2");
                }//if
            }//onclick
        });//setOnClickListener
        this.threeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum("3");
                }//if
            }//onclick
        });//setOnClickListener
        this.fourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum("4");
                }//if
            }//onclick
        });//setOnClickListener
        this.fiveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum("5");
                }//if
            }//onclick
        });//setOnClickListener
        this.sixButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum("6");
                }//if
            }//onclick
        });//setOnClickListener
        this.sevenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum("7");
                }//if
            }//onclick
        });//setOnClickListener
        this.eightButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum("8");
                }//if
            }//onclick
        });//setOnClickListener
        this.nineButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum("9");
                }//if
            }//onclick
        });//setOnClickListener
        this.zeroButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum("0");
                }//if
            }//onclick
        });//setOnClickListener
        this.decimalButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setNum(".");
                }//if
            }//onclick
        });//setOnClickListener
        this.plusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setArithUsed(ADD);
                }//if
            }//onclick
        });//setOnClickListener
        this.minusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setArithUsed(SUB);
                }//if
            }//onclick
        });//setOnClickListener
        this.divideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setArithUsed(DIV);
                }//if
            }//onclick
        });//setOnClickListener
        this.multiplyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    setArithUsed(MUL);
                }//if
            }//onclick
        });//setOnClickListener
        this.equalsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    calculate();
                }//if
            }//onclick
        });//setOnClickListener
        this.plusMinusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    plusMinus();
                }//if
            }//onclick
        });//setOnClickListener
        this.percentButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    percent();
                }//if
            }//onclick
        });//setOnClickListener
        this.ACButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!reset) {
                    clear();
                }//if
            }//onclick
        });//setOnClickListener

    }//on create

    //private methods

    private void setNum(String s){
        if(this.isFirstNum){
            if(this.firstNumString == "0" && s != "."){
                this.firstNumString = s;
            }//if
            else if (s == "."){
                if(firstNumString.indexOf(s) == -1){
                    this.firstNumString += s;
                }//if
            }//elseif
            else{
                this.firstNumString += s;
            }//else

            this.resultView.setText(this.firstNumString);
        }//if

        else{
            if(this.secondNumString == "0" && s != "."){
                this.secondNumString = s;
            }//if
            else if (s== "."){
                if(secondNumString.indexOf(s) == -1){
                    this.secondNumString += s;
                }//if
            }//else if
            else{
                this.secondNumString += s;
            }//else
            this.resultView.setText (this.secondNumString);
        }//else
    }//setNum

    private void setArithUsed(int i){
        switch(i){
            case ADD: this.arithUsedString = "+";
                break;
            case SUB: this.arithUsedString = "-";
                break;
            case MUL: this.arithUsedString = "x";
                break;
            case DIV: this.arithUsedString = "/";
                break;
        }//switch
        if(this.isFirstNum){
            this.isFirstNum = false;
        }//of
        else{
            this.calculate();
        }//else
        this.arithUsed = i;

        this.resultView.setText(this.firstNumString + this.arithUsedString);
    }

    private void calculate(){
        boolean error = false;

        if(this.arithUsed != -1 && this.secondNumString != ""){
            this.firstNum = Double.parseDouble(firstNumString);
            this.secondNum = Double.parseDouble(secondNumString);

            switch(this.arithUsed){
                case ADD: this.firstNum += this.secondNum;
                    break;
                case SUB: this.firstNum -= this.secondNum;
                    break;
                case MUL: this.firstNum *= this.secondNum;
                    break;
                case DIV: if (this.secondNum == 0){
                    error = true;
                }
                else{
                    this.firstNum /= this.secondNum;
                }//else
            }//switch
            if (!error){
                firstNumString = decFormat.format(firstNum);
                secondNumString = "";
            }//if
            else{
                firstNumString = "undefined";
                reset = true;
            }//else

            this.resultView.setText(this.firstNumString);
        }//if
    }//calculate

    private void plusMinus(){
        if(this.isFirstNum){
            if(Double.parseDouble(this.firstNumString) != 0){
                if(this.firstNumString.indexOf("-") == -1){
                    this.firstNumString = "-" + this.firstNumString;
                }//if
                else{
                    this.firstNumString = this.firstNumString.substring(1);
                }//else
                this.resultView.setText(this.firstNumString);
            }//if
            else{
                this.secondNumString = this.secondNumString.substring(1);
            }//else
            this.resultView.setText(this.firstNumString +this.arithUsedString + secondNumString);
        }

    }
    private void percent(){
        if(!isFirstNum && secondNumString != ""){
            firstNum = Double.parseDouble(firstNumString);
            secondNum = Double.parseDouble(secondNumString);

            secondNum = ((firstNum /100) * secondNum);

            secondNumString = String.valueOf(secondNum);

            this.resultView.setText(this.firstNumString + this.arithUsedString + secondNumString);
        }//if

    }//percent
    private void clear(){
        this.firstNum = 0;
        this.firstNumString = "0";
        this.secondNum = 0;
        this.secondNumString = "0";
        this.isFirstNum = true;
        this.arithUsed = -1;
        this.reset = false;

        this.resultView.setText(this.firstNumString);
    }//clear

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
