package a1.assignment3.acadgild.com.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hide the status bar up top since the photo from the assignment shows no status bar up top
        getSupportActionBar().hide();
    }
}
