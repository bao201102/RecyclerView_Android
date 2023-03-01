package bao201102.gmail.com.testrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    ImageView iv;
    TextView tv_title, tv_des;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iv = findViewById(R.id.iv);
        tv_title = findViewById(R.id.tv_title2);
        tv_des = findViewById(R.id.tv_des);

        Photo photo = (Photo) getIntent().getSerializableExtra("photo");

        tv_des.setText(photo.getDescription_photo());
        tv_title.setText(photo.getTitle_photo());
        Picasso.get().load(photo.getSource_photo()).into(iv);
    }
}