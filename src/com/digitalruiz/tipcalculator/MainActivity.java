package com.digitalruiz.tipcalculator;


import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	public EditText etAmount;
	public TextView tvTip;
	
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAmount = (EditText) findViewById(R.id.etAmount);
        tvTip = (TextView) findViewById(R.id.tvTip);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void on10(View v) {
    	double dAmount = Double.parseDouble(etAmount.getText().toString());
    	double result = (double)((dAmount*10)/100);
    	tvTip.setText(new DecimalFormat("\u00A40.00").format(result));
    	InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
    	inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }
    public void on15(View v) {
    	double dAmount = Double.parseDouble(etAmount.getText().toString());
    	double result = (double)((dAmount*15)/100);
    	tvTip.setText(new DecimalFormat("\u00A40.00").format(result));
    	InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
    	inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }
    public void on20(View v) {
    	double dAmount = Double.parseDouble(etAmount.getText().toString());
    	double result = (double)((dAmount*20)/100);
    	tvTip.setText(new DecimalFormat("\u00A40.00").format(result));
    	InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
    	inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }
}
