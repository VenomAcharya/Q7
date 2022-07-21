package com.example.q7;
//Java Program to Find the Frequency of Character in a String
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;

    int i,j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.etChar);
        button = (Button) findViewById(R.id.btnCheck);
        textView = (TextView) findViewById(R.id.tvResult);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] freq = new int[editText.length()];
                    String s = editText.getText().toString();
                    char arr[]=s.toCharArray();
                        for(i=0;i<editText.length();i++){
                            freq[i] = 1;
                            for (j = i+1; j <editText.length(); j++){
                                if(arr[i] == arr[j]){
                                    freq[i]++;
                                    arr[j] = '0';
                                }
                            }

                        }
                for(i = 0; i <freq.length; i++) {
                    if(arr[i] != ' ' && arr[i] != '0')
                        textView.setText(arr[i]+" - "+freq[i]);
                }
            }

        });
    }
}