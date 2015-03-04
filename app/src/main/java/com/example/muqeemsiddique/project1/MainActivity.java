package com.example.muqeemsiddique.project1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {


    CheckBox mShow_Pwd;
    EditText mpwdedit;
    Button mlogin;
    TextView mlogintext;
    ImageView mimageView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // get the pwdedit EditText
        // get the imageview1 ImageView
        // get the login Button
        //get the logintext TextView
        //get the Show_Pwd CheckBox


        mShow_Pwd = (CheckBox) findViewById(R.id.Show_Pwd);
        mpwdedit  = (EditText) findViewById(R.id.Pwdedit);
        mlogintext = (TextView) findViewById(R.id.logintext);
        mlogin = (Button) findViewById(R.id.login);
        mimageView1 = (ImageView) findViewById(R.id.imageView1);

        // add onCheckedListener on checkbox

        mShow_Pwd.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    mpwdedit.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    mpwdedit.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        //add onClickListener on login
        mlogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mlogintext.setText("Processing");
                mlogin.setText("signing in");
                mimageView1.setImageResource(R.drawable.sample);


            }
        });
    }
}


    







