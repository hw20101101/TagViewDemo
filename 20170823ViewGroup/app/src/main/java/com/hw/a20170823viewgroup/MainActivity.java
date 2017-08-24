package com.hw.a20170823viewgroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findTopListView();
        findBottomListView();
    }

    private void findTopListView(){

        ListView topListView = (ListView) findViewById(R.id.top_list_view);
        topListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.e("ViewGroupTAG", "-->> topListView onItemClick:" + position);
            }
        });

        String[] topTags = {"TopTag1", "TopTag2", "TopTag3"};
        ListViewEntity topListViewEntity = new ListViewEntity();
        topListViewEntity.setTitle("点击 TAG 可触发 ListView 的点击事件");
        topListViewEntity.setTags(topTags);
        topListViewEntity.setIfInterceptEvent(false);

        ListViewAdapter topListViewAdapter = new ListViewAdapter(this, topListViewEntity);
        topListView.setAdapter(topListViewAdapter);
    }

    private void findBottomListView(){

        ListView bottomListView = (ListView) findViewById(R.id.bottom_list_view);
        bottomListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.e("ViewGroupTAG", "-->> bottomListView onItemClick:" + position);
            }
        });

        String[] bottomTags = {"BottomTag1", "BottomTag2", "BottomTag3"};
        ListViewEntity bottomListViewEntity = new ListViewEntity();
        bottomListViewEntity.setTitle("点击 TAG 不可触发 ListView 的点击事件");
        bottomListViewEntity.setTags(bottomTags);
        bottomListViewEntity.setIfInterceptEvent(true);

        ListViewAdapter bottomListViewAdapter = new ListViewAdapter(this, bottomListViewEntity);
        bottomListView.setAdapter(bottomListViewAdapter);
    }
}
