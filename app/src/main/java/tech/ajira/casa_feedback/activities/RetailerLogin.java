package tech.ajira.casa_feedback.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tech.ajira.casa_feedback.R;
import tech.ajira.casa_feedback.commonHelpers.CommonHelpers;

public class RetailerLogin extends AppCompatActivity {

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_login);

        initViews();
        setCustomFont();
    }

    private void initViews(){
        btnLogin = (Button) findViewById(R.id.login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RetailerLogin.this, CustomerLogin.class));
            }
        });
    }

    private void setCustomFont(){
        try {
            this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            this.getSupportActionBar().setCustomView(CommonHelpers.actionBarTitle(this, "Retailer Login"));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
