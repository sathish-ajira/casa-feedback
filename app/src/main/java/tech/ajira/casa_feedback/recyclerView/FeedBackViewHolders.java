package tech.ajira.casa_feedback.recyclerView;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import java.util.ArrayList;

import tech.ajira.casa_feedback.R;

class FeedBackViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView questionTextView;

    FeedBackViewHolders(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        questionTextView = (TextView) itemView.findViewById(R.id.question);
    }

    @Override
    public void onClick(View view) {

    }
}
