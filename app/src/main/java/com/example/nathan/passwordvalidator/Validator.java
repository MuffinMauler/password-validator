package com.example.nathan.passwordvalidator;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A login screen that offers login via email/password.
 */
public class Validator extends Activity {

    String pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);
    }

    public void setPassword(View view) {
        EditText editText = (EditText) findViewById(R.id.enter_password);
        pw = editText.getText().toString();
    }

    public void checkPassword() {
        Password.isNotPassword(pw);
        Password.isLongEnough(pw);
    }

}

