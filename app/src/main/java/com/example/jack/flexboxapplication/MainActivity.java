package com.example.jack.flexboxapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_view;
    private MainAdapter mainAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_view=(RecyclerView)findViewById(R.id.recycler_view);
        FlexboxLayoutManager flexboxLayoutManager=new FlexboxLayoutManager(this);
        flexboxLayoutManager.setFlexWrap(FlexWrap.WRAP);
        recycler_view.setLayoutManager(flexboxLayoutManager);
        mainAdapter=new MainAdapter(this);
        recycler_view.setAdapter(mainAdapter);
    }

}
