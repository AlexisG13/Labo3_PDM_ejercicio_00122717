package com.alexisg13.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.alexisg13.labo3.utils.AppConstants;

public class SecondActivity extends AppCompatActivity {

    TextView mName, mSurname, mEmail, mAge;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mName=findViewById(R.id.name_view);
        mSurname=findViewById(R.id.surname_view);
        mEmail=findViewById(R.id.email_view);
        mAge=findViewById(R.id.age_view);
        mButton=findViewById(R.id.btn_share);

        Intent mIntent = getIntent();

        mName.setText(mIntent.getStringExtra(AppConstants.NAME_KEY));
        mSurname.setText(mIntent.getStringExtra(AppConstants.SURNAME_KEY));
        mEmail.setText(mIntent.getStringExtra(AppConstants.EMAIL_KEY));
        mAge.setText(mIntent.getStringExtra(AppConstants.AGE_KEY));

        mButton.setOnClickListener(v->{
            String name = mName.getText().toString();
            String surname = mSurname.getText().toString();
            String email = mEmail.getText().toString();
            String age = mAge.getText().toString();

            Intent shareIntent = new Intent();
            shareIntent.setType("text/plain");
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(AppConstants.NAME_KEY,name);
            shareIntent.putExtra(AppConstants.SURNAME_KEY,surname);
            shareIntent.putExtra(AppConstants.EMAIL_KEY,email);
            shareIntent.putExtra(AppConstants.AGE_KEY,age);
            startActivity(shareIntent);
        });


    }
}
