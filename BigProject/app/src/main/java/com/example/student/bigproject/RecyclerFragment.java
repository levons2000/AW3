package com.example.student.bigproject;


import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerFragment extends android.app.Fragment {


    public RecyclerFragment() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler, container, false);
        List<ChatModel> list = new ArrayList<>();
        list.add(new ChatModel(R.drawable.one, "Anjel", "Krqotik", "+37477448747", "anjel@gmail.com"));
        list.add(new ChatModel(R.drawable.two, "Anna", "Sochii", "+37494977225", "anna@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Agnes", "tangacnuma iran(10000 dram)", "+37498543776", "agnes@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        list.add(new ChatModel(R.drawable.three, "Ancanot", "Srteri talanich", "+37493569524", "ananimous@gmail.com"));
        AdapterForChat adapterForChat = new AdapterForChat(getContext(), list, R.layout.chat_recycler_item);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        final RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterForChat);
        recyclerView.setHasFixedSize(true);
        return v;
    }

}
