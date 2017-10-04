package tech.ajira.casa_feedback.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tech.ajira.casa_feedback.R;
import tech.ajira.casa_feedback.commonHelpers.CommonHelpers;

public class CustomerLogin extends AppCompatActivity {

    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);
        initViews();
        setCustomFont();
    }

    private void initViews(){
        btnSubmit = (Button) findViewById(R.id.submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomerLogin.this, Dashboard.class));
            }
        });
    }

    private void setCustomFont(){
        try {
            this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            this.getSupportActionBar().setCustomView(CommonHelpers.actionBarTitle(this, "Customer Login"));
        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
