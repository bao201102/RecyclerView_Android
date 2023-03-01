package bao201102.gmail.com.testrecyclerview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;
import java.util.zip.Inflater;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder> {
    private final LayoutInflater mInflater;
    LinkedList<String> mWordList = new LinkedList<>();

    public WordListAdapter(Context context, LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create view from layout
        View mItemView = mInflater.inflate(R.layout.activity_second, parent, false);
        return new WordViewHolder(mItemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
            // Retrieve the data for that position
            String mCurrent = mWordList.get(position);
            // Add the data to the view
            holder.wordItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        // Return the number of data items to display
        return mWordList.size();
    }
}
