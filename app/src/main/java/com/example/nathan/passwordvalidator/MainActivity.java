package com.example.nathan.passwordvalidator;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A login screen that offers login via email/password.
 */
public class MainActivity extends Activity {

    String pw;
    int pwStrength = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);
    }

    public void setPassword(View view) {
        EditText editText = (EditText) findViewById(R.id.enter_password);
        pw = editText.getText().toString();
        checkPassword();
        displayStrength();
    }

    public void checkPassword() {
        pwStrength = Password.getStrength(pw);
    }

    public void displayStrength () {
        TextView tv = (TextView) findViewById(R.id.display_strength);
        if (pwStrength == 1)
            tv.setText("The weakest password in the history of passwords, maybe ever. (1/5 Weak)");
        if (pwStrength == 2)
            tv.setText("Not your best work. (2/5 Weak)");
        if (pwStrength == 3)
            tv.setText("Now we're getting somewhere. (3/5 Strong)");
        if (pwStrength == 4)
            tv.setText("You've come a long way.(4/5 Strong)");
        if (pwStrength == 5)
            tv.setText("Nice. (5/5 Strong)");
    }

}

