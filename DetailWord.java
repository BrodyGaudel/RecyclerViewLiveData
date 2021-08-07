package com.mounangabouka.guide.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.mounangabouka.guide.R;

public class DetailWord extends AppCompatActivity {

    TextView showWord;
    Bundle b;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_word);
        init();
    }
    public void init() {
        showWord = findViewById(R.id.detail);
        b = getIntent().getExtras();
        name = b.getString("Title");
        showWord.setText(name);
    }
}