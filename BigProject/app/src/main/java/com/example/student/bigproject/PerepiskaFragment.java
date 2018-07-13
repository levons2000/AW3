package com.example.student.bigproject;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class PerepiskaFragment extends android.app.Fragment {

    private ChatModel chatModel;
    int i = -1;
    ArrayList<String> arrayList = new ArrayList<>();

    public PerepiskaFragment() {
        // Required empty public constructor
    }

    public PerepiskaFragment(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perepiska, container, false);
        final List<MessageModel> list = new ArrayList<>();
        final AdapterForMessage adapterForMessage = new AdapterForMessage(getContext(), R.layout.message_item, list);
        final ListView listView = v.findViewById(R.id.messageslist);
        listView.setAdapter(adapterForMessage);
        ImageView imageViewUser = v.findViewById(R.id.imageformessage);
        TextView textViewName = v.findViewById(R.id.nameformessage);
        final EditText editText = v.findViewById(R.id.addmessage);
        ImageButton sendButton = v.findViewById(R.id.imgbuttonsend);
        imageViewUser.setImageResource(chatModel.getImgResource());
        textViewName.setText(chatModel.getName());
        addMessages(arrayList);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(new MessageModel(chatModel.getImgResource(), editText.getText().toString(), true));
                adapterForMessage.notifyDataSetChanged();
                list.add(new MessageModel(chatModel.getImgResource(), botMessager(), false));
                adapterForMessage.notifyDataSetChanged();
                editText.setText("");
            }
        });

        return v;
    }


    private void addMessages(ArrayList<String> arrayList) {
        arrayList.add("Barev");
        arrayList.add("Shutvanica chenq xosacel");
        arrayList.add("Es qani or@ tenanq irar");
        arrayList.add("Tneciq vonc en?");
        arrayList.add("De saxin aroxjutyun");
    }

    private String botMessager() {
        ++i;
        return arrayList.get(i);
    }

}
