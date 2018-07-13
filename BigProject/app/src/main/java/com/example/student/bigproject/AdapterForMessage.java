package com.example.student.bigproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Student on 7/13/2018.
 */

public class AdapterForMessage extends ArrayAdapter {

    private List<MessageModel> list;
    private Context context;
    private int resource;

    public AdapterForMessage(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        list = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = LayoutInflater.from(context).inflate(resource, parent, false);
        RelativeLayout relativeLayoutMy = v.findViewById(R.id.layout_my);
        RelativeLayout relativeLayoutNot = v.findViewById(R.id.layout_not_my);

        if (list.get(position).isMy) {
            relativeLayoutMy.setVisibility(View.VISIBLE);
            relativeLayoutNot.setVisibility(View.GONE);
            TextView textView = v.findViewById(R.id.message_text_my);
            textView.setText(list.get(position).getText());
            textView.setBackgroundColor(context.getResources().getColor(R.color.blue));
        }else{
            relativeLayoutMy.setVisibility(View.GONE);
            relativeLayoutNot.setVisibility(View.VISIBLE);
            ImageView imageView = v.findViewById(R.id.image_list_item_not);
            TextView textView = v.findViewById(R.id.message_not_text);
            imageView.setImageResource(list.get(position).getImgRes());
            textView.setText(list.get(position).getText());
            textView.setBackgroundColor(context.getResources().getColor(R.color.gray));
        }
        return v;
    }
}
