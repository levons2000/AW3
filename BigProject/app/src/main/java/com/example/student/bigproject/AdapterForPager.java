package com.example.student.bigproject;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Student on 7/9/2018.
 */

public class AdapterForPager extends PagerAdapter {

    private List<PagerModel> list;
    private Context context;

    public AdapterForPager(List<PagerModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        final LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View view = layoutInflater.inflate(R.layout.view_pager_model, container, false);
        final ImageView imageView = view.findViewById(R.id.vp_model_img);
        final TextView textView = view.findViewById(R.id.vp_model_text);
        final ImageButton imageButton = view.findViewById(R.id.go_to_next_activity);
        textView.setText(list.get(position).getTitle());
        Picasso.with(context).load(list.get(position).getImgUrl()).into(imageView);
        container.addView(view);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ChatActivity.class);
                context.startActivity(intent);
            }
        });
        return view;
    }

}
