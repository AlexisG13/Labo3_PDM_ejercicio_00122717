package com.alexisg13.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alexisg13.labo3.utils.AppConstants;

public class ThirdActivity extends AppCompatActivity {

    TextView mName, mSurname, mEmail, mAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mName=findViewById(R.id.tv_name);
        mSurname=findViewById(R.id.tv_surname);
        mEmail=findViewById(R.id.tv_email);
        mAge=findViewById(R.id.tv_age);

        Intent mIntent = getIntent();

        if(mIntent!=null) {
            mName.setText("Nombre: " +mIntent.getStringExtra(AppConstants.NAME_KEY));
            mSurname.setText("Apellido: " +mIntent.getStringExtra(AppConstants.SURNAME_KEY));
            mEmail.setText("Correo: " +mIntent.getStringExtra(AppConstants.EMAIL_KEY));
            mAge.setText("Edad:" +mIntent.getStringExtra(AppConstants.AGE_KEY));
        }
    }
}
