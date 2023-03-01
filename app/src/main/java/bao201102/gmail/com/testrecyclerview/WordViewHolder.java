package bao201102.gmail.com.testrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView tv_title, tv_content;
    private ImageView iv_photo;
    private int id;
    private WordListAdapter mAdapter;
    private Context context;

    public TextView getTv_title() {
        return tv_title;
    }

    public void setTv_title(TextView tv_title) {
        this.tv_title = tv_title;
    }

    public TextView getTv_content() {
        return tv_content;
    }

    public void setTv_content(TextView tv_content) {
        this.tv_content = tv_content;
    }

    public ImageView getIv_photo() {
        return iv_photo;
    }

    public void setIv_photo(ImageView iv_photo) {
        this.iv_photo = iv_photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WordViewHolder(View itemView, WordListAdapter adapter, Context context) {
        super(itemView);
        // Get the layout
        tv_content = itemView.findViewById(R.id.tv_content);
        tv_title = itemView.findViewById(R.id.tv_title);
        iv_photo = itemView.findViewById(R.id.iv_photo);
        // Associate with this adapter
        this.context = context;
        this.mAdapter = adapter;
        // Add click listener, if desired
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(context, DetailActivity.class);
        Photo mCurrent = PhotoData.getPhotoFromId(id);
        i.putExtra("photo", mCurrent);
        context.startActivity(i);
    }
}
