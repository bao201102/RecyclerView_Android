package bao201102.gmail.com.testrecyclerview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.zip.Inflater;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder> {
    private final LayoutInflater mInflater;
    ArrayList<Photo> photos = new ArrayList<>();
    Context context;

    public WordListAdapter(Context context, ArrayList<Photo> photo) {
        mInflater = LayoutInflater.from(context);
        this.photos = photo;
        this.context = context;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create view from layout
        View mItemView = mInflater.inflate(R.layout.item_photo, parent, false);
        return new WordViewHolder(mItemView,this, context);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        // Retrieve the data for that position
        Photo mCurrent = photos.get(position);
        // Add the data to the view
        holder.setId(mCurrent.getId());
        holder.getTv_title().setText(mCurrent.getTitle_photo());
        Picasso.get().load(mCurrent.getSource_photo()).into(holder.getIv_photo());

        ArrayList<String> strSplit = new ArrayList<>();
        strSplit.addAll(Arrays.asList(mCurrent.getDescription_photo().split(" ")));
        if (strSplit.size() <= 10) {
            holder.getTv_content().setText(mCurrent.getDescription_photo());
        } else {
            strSplit.subList(10, strSplit.size()).clear();
            String strJoin = String.join(" ", strSplit);
            holder.getTv_content().setText(strJoin + "...");
        }
    }

    @Override
    public int getItemCount() {
        // Return the number of data items to display
        return photos.size();
    }
}
