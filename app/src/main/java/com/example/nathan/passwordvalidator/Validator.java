package com.example.nathan.passwordvalidator;


import android.app.Activity;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class Validator extends Activity {

    // UI references.
    private EditText mPasswordView;

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

}

