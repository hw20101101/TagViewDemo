package com.hw.a20170823viewgroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by HW on 23/08/2017.
 */

public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private ListViewEntity listViewEntity;
    private LayoutInflater layoutInflater;

    public ListViewAdapter(Context context, ListViewEntity listViewEntity){
        this.context = context;
        this.listViewEntity = listViewEntity;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = layoutInflater.inflate(R.layout.layout_list_view_item, null);
        TextView textView = view.findViewById(R.id.text_view);
        textView.setText(listViewEntity.getTitle());

        HWTagContainerLayout tagContainerLayout = view.findViewById(R.id.tag_view);
        tagContainerLayout.setIfInterceptEvent(listViewEntity.isIfInterceptEvent());
        tagContainerLayout.setTags(listViewEntity.getTags());
        return view;
    }
}
