package com.alexisg13.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.alexisg13.labo3.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    EditText mName, mSurname, mEmail, mAge;
    Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mName=findViewById(R.id.name_entry);
        mSurname=findViewById(R.id.surname_entry);
        mEmail=findViewById(R.id.email_entry);
        mAge=findViewById(R.id.age_entry);
        mBtn=findViewById(R.id.submit_btn);

        mBtn.setOnClickListener(v->{
            String name = mName.getText().toString();
            String surname = mSurname.getText().toString();
            String email = mEmail.getText().toString();
            String age = mAge.getText().toString();
            Intent mIntent = new Intent(this,SecondActivity.class);
            mIntent.putExtra(AppConstants.NAME_KEY,name);
            mIntent.putExtra(AppConstants.SURNAME_KEY,surname);
            mIntent.putExtra(AppConstants.EMAIL_KEY,email);
            mIntent.putExtra(AppConstants.AGE_KEY,age);
            startActivity(mIntent);
        });

    }
}
