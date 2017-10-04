package tech.ajira.casa_feedback.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import tech.ajira.casa_feedback.R;

class QuestionEditViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView questionTextView;

    QuestionEditViewHolders(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        questionTextView = (TextView) itemView.findViewById(R.id.question);
    }

    @Override
    public void onClick(View view) {

    }
}
