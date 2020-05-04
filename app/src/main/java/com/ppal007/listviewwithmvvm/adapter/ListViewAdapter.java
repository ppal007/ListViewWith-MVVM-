package com.ppal007.listviewwithmvvm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;

import com.ppal007.listviewwithmvvm.R;
import com.ppal007.listviewwithmvvm.databinding.ListViewBiding;
import com.ppal007.listviewwithmvvm.viewmodel.ListViewModel;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ListViewModel> listViewModels;
    private ListViewBiding listViewBiding;

    public ListViewAdapter(Context context, ArrayList<ListViewModel> listViewModels) {
        this.context = context;
        this.listViewModels = listViewModels;
    }

    @Override
    public int getCount() {
        return listViewModels.size();
    }

    @Override
    public Object getItem(int position) {
        return listViewModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_sample,null);
            listViewBiding = DataBindingUtil.bind(convertView);
            convertView.setTag(listViewBiding);
        }else {
            listViewBiding = (ListViewBiding) convertView.getTag();
        }

        listViewBiding.setProfileList(listViewModels.get(position));

        return listViewBiding.getRoot();
    }
}
