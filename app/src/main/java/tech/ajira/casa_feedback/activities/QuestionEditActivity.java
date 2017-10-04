package tech.ajira.casa_feedback.activities;

import android.app.ActionBar;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import tech.ajira.casa_feedback.R;
import tech.ajira.casa_feedback.commonHelpers.CommonHelpers;
import tech.ajira.casa_feedback.models.Feedback;
import tech.ajira.casa_feedback.recyclerView.FeedBackViewAdapter;

public class QuestionEditActivity extends AppCompatActivity {

    FeedBackViewAdapter feedBackViewAdapter;
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_edit);

        initializeRecyclerViews();
        setCustomFont();
    }

    private void setCustomFont(){
        try {
            this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            this.getSupportActionBar().setCustomView(CommonHelpers.actionBarTitle(this, "Add and Edit Feedback Questions"));
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    private void initializeRecyclerViews() {
        List<Feedback> questionList = new ArrayList<>();
        questionList.add(new Feedback("Your overall experience at this store?"));
        questionList.add(new Feedback("The prices offered were appropriate to the items?"));
        questionList.add(new Feedback("Compared to similar stores, how fair are this store's prices?"));
        questionList.add(new Feedback("How helpful are the employees at this store?"));
        questionList.add(new Feedback("How friendly are the employees at this store?"));
        questionList.add(new Feedback("How likely are you to recommend this store to others"));
        gridLayoutManager = new GridLayoutManager(QuestionEditActivity.this, 1);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setFocusable(false);

        feedBackViewAdapter = new FeedBackViewAdapter(QuestionEditActivity.this, questionList);
        recyclerView.setAdapter(feedBackViewAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.upFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
