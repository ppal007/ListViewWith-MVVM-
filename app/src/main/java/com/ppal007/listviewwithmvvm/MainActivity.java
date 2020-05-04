package com.ppal007.listviewwithmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ppal007.listviewwithmvvm.adapter.ListViewAdapter;
import com.ppal007.listviewwithmvvm.databinding.ActivityMainBinding;
import com.ppal007.listviewwithmvvm.viewmodel.ListViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private ArrayList<ListViewModel> listViewModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        listViewModels = new ArrayList<>();

        ListViewModel model1 = new ListViewModel("Title 1", "Description 1", "path 1");
        ListViewModel model2 = new ListViewModel("Title 2", "Description 2", "path 2");
        ListViewModel model3 = new ListViewModel("Title 3", "Description 3", "path 3");
        ListViewModel model4 = new ListViewModel("Title 4", "Description 4", "path 4");
        ListViewModel model5 = new ListViewModel("Title 5", "Description 5", "path 5");

        listViewModels.add(model1);
        listViewModels.add(model2);
        listViewModels.add(model3);
        listViewModels.add(model4);
        listViewModels.add(model5);

//        add list adapter...........................................................................
        ListViewAdapter adapter = new ListViewAdapter(this,listViewModels);
        mainBinding.listViewId.setAdapter(adapter);
    }
}
