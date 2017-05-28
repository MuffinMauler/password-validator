package com.example.nathan.passwordvalidator;

import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;

public class ValidatorTest {

    private String textWeak;
    private String textStrong;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initString()
    {
        textWeak = "Weak";
        textStrong = "Strong";
    }

    @Test
    public void findButton() { //finds the button
        onView(withId(R.id.validate_button)); //if this fails it could be the cause of other fails
    }

    @Test
    public void checkStrongEnough() { //checks if a strong password is properly listed as strong
        onView(withId(R.id.enter_password)).perform(typeText("BettyWhiteCat;)")); //sets strongest password
        onView(withId(R.id.validate_button)).perform(click()); //clicks validate button
        onView(withId(R.id.display_strength)).check(matches(withText(containsString(textStrong)))); //checks if the password is strong enough
    }

    @Test
    public void checkNotTooWeak() { //checks if a weak password is properly listed as weak
        onView(withId(R.id.enter_password)).perform(typeText("password")); //sets strongest password
        onView(withId(R.id.validate_button)).perform(click()); //clicks validate button
        onView(withId(R.id.display_strength)).check(matches(withText(containsString(textWeak)))); //checks if the password is strong enough
    }

}
