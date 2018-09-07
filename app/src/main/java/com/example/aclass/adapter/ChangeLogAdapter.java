package com.example.aclass.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.aclass.R;
import com.zhuangfei.timetable.model.Schedule;

import java.util.List;

public class ChangeLogAdapter extends BaseAdapter {

    private Context mContext;
    private int resourceId;

    public ChangeLogAdapter(@NonNull Context context, @LayoutRes int resource) {
        this.resourceId = resource;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View myView = LayoutInflater.from(mContext).inflate(resourceId,null);

        return myView;
    }
}
