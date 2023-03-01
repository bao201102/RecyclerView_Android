package bao201102.gmail.com.testrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView wordItemView;
    private final WordListAdapter mAdapter;
    public WordViewHolder(View itemView, WordListAdapter adapter) {
        super(itemView);
        // Get the layout
        wordItemView = itemView.findViewById(R.id.textView);
        // Associate with this adapter
        this.mAdapter = adapter;
        // Add click listener, if desired
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
