package com.example.student.bigproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    static android.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        RecyclerFragment chatFragment = new RecyclerFragment();
        fragmentTransaction.add(R.id.container_for_fragment, chatFragment).addToBackStack(null).commit();


    }

    public static void fragmentSetter(ChatModel chatModel){
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PerepiskaFragment perepiskaFragment = new PerepiskaFragment(chatModel);
        fragmentTransaction.replace(R.id.container_for_fragment, perepiskaFragment).addToBackStack(null).commit();
    }



}
