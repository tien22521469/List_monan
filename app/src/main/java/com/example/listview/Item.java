package com.example.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

public class Item {
    private int imageResource;
    private String title;
    private String description1;
    private String description2;

    public Drawable getImageResource(Context context) {
        return ContextCompat.getDrawable(context, imageResource);
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public Item(int imageResource, String title, String description1, String description2) {
        this.imageResource = imageResource;
        this.title = title;
        this.description1 = description1;
        this.description2 = description2;
    }
}
