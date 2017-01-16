package br.com.facebooklogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String name = getIntent().getStringExtra("Username");
        TextView username = (TextView) findViewById(R.id.username);
        username.setText(name);
    }
}
