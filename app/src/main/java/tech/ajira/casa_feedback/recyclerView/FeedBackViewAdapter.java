package tech.ajira.casa_feedback.recyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import tech.ajira.casa_feedback.R;
import tech.ajira.casa_feedback.models.Feedback;

public class FeedBackViewAdapter extends RecyclerView.Adapter<FeedBackViewHolders>{

    private List<Feedback> questionList;
    private Context context;

    public FeedBackViewAdapter(Context context, List<Feedback> questionList) {
        this.questionList = questionList;
        this.context = context;
    }

    @Override
    public FeedBackViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_feedback, null);
        FeedBackViewHolders rcv = new FeedBackViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(final FeedBackViewHolders holder, int position) {
        holder.questionTextView.setText(questionList.get(position).getQuestion());
    }
    @Override
    public int getItemCount() {
        return this.questionList.size();
    }

}
