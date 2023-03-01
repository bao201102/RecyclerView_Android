package bao201102.gmail.com.testrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    RecyclerView  mRecyclerView;
    private WordListAdapter mAdapter;
    private LinkedList<String> mWorkList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWorkList.add("SQL");
        mWorkList.add("Java");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("SQL");
        mWorkList.add("Java");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");mWorkList.add("SQL");
        mWorkList.add("Java");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");mWorkList.add("SQL");
        mWorkList.add("Java");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");
        mWorkList.add("C#");

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, mWorkList);
        mRecyclerView.setAdapter((RecyclerView.Adapter) mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}