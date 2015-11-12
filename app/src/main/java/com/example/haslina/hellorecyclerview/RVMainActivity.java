package com.example.haslina.hellorecyclerview;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class RVMainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvmain);
        // 1. get a reference to recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        // this is the data for our recycler view
        ItemData itemsData[] = {new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four)
                ,new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four)
                 ,new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four)
                ,new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four)
                ,new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four),
                new ItemData("Alkane", R.drawable.one),
                new ItemData("Ethane", R.drawable.two),
                new ItemData("Alkyne", R.drawable.three),
                new ItemData("Benzene", R.drawable.four)};

        //  set layoutManger
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,1));
        //  create an adapter
        MyAdapter mAdapter = new MyAdapter(itemsData,getApplicationContext());
        //  set adapter
        recyclerView.setAdapter(mAdapter);
        // set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rvmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
