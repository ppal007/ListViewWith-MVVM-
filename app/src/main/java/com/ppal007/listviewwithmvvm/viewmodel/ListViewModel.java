package com.ppal007.listviewwithmvvm.viewmodel;

import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.BindingAdapter;

import com.ppal007.listviewwithmvvm.R;
import com.squareup.picasso.Picasso;

public class ListViewModel extends BaseObservable {

    public String title,desc,imgPath;

    public ListViewModel(String title, String desc, String imgPath) {
        this.title = title;
        this.desc = desc;
        this.imgPath = imgPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImgPath() {
        return imgPath;
    }

    @BindingAdapter("imgUrl")
    public static void loadImg(ImageView imageView,String imgPath){
        Picasso.with(imageView.getContext())
                .load(imgPath)
                .placeholder(R.drawable.test_me)
                .into(imageView);
    }
}
