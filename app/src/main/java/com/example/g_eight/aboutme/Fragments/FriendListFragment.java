package com.example.g_eight.aboutme.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import com.example.g_eight.aboutme.Adapters.FriendListAdapter;
import com.example.g_eight.aboutme.Models.FriendListModel;
import com.example.g_eight.aboutme.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by G-Eight on 5/19/2019.
 * 10116114
 * Hatta Pramulia
 * IF-3
 **/

public class FriendListFragment extends Fragment {

    private ListView lv;
    private FriendListAdapter adapter;
    private List<FriendListModel> friendList;
    private FriendListModel friend;
    private ArrayList<String> data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friend_list, container, false);
        FloatingActionButton btnAdd = view.findViewById(R.id.btn_add);

        createDataDummy();
        lv = view.findViewById(R.id.list_judul);
        adapter = new FriendListAdapter(getActivity().getApplicationContext(), friendList);
        lv.setAdapter(adapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopUp(view);
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showPopUp(view,friendList,i);
            }
        });

        return view;
    }

    public void addFriendList(View view){
        EditText etName = view.findViewById(R.id.et_name);
        EditText etStudentID = view.findViewById(R.id.et_sid);
        EditText etClass = view.findViewById(R.id.et_class);
        EditText etPhone = view.findViewById(R.id.et_phone);
        EditText etEmail = view.findViewById(R.id.et_email);
        EditText etSocMed = view.findViewById(R.id.et_socmed);
        data = new ArrayList<>();
        data.add(etName.getText().toString());
        data.add(etStudentID.getText().toString());
        data.add(etClass.getText().toString());
        data.add(etPhone.getText().toString());
        data.add(etEmail.getText().toString());
        data.add(etSocMed.getText().toString());

        friendList = new ArrayList<>();
        friendList.add(new FriendListModel(data.get(0), data.get(1), data.get(2), data.get(3)
                , data.get(4), data.get(5)));
    }

    public void showPopUp(View view, List<FriendListModel> flm, int i) {
        LayoutInflater inf = (LayoutInflater)
                getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View popupView = inf.inflate(R.layout.popup_window, null);
        Button btnSave = popupView.findViewById(R.id.btn_save);
        Button btnDelete = popupView.findViewById(R.id.btn_delete);

        EditText etName = popupView.findViewById(R.id.et_name);
        EditText etSid = popupView.findViewById(R.id.et_sid);
        EditText etClass = popupView.findViewById(R.id.et_class);
        EditText etPhone = popupView.findViewById(R.id.et_phone);
        EditText etEmail = popupView.findViewById(R.id.et_email);
        EditText etSocMed = popupView.findViewById(R.id.et_socmed);

        btnSave.setText("Save");
        btnDelete.setVisibility(View.VISIBLE);


        etName.setText(flm.get(i).getName());
        etSid.setText(flm.get(i).getStudentId());
        etClass.setText(flm.get(i).getClassRoom());
        etPhone.setText(flm.get(i).getPhoneNumber());
        etEmail.setText(flm.get(i).getEmail());
        etSocMed.setText(flm.get(i).getSocialMedia());

        // create the popup window
        int width = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);

        // show the popup window
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

    }

    public void showPopUp(View view) {
        LayoutInflater inf = (LayoutInflater)
                getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View popupView = inf.inflate(R.layout.popup_window, null);
        Button btnSave = popupView.findViewById(R.id.btn_save);

        // create the popup window
        int width = RelativeLayout.LayoutParams.WRAP_CONTENT;
        int height = RelativeLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);

        // show the popup window
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                    addFriendList(popupView);
//            }
//        });

    }

    public void createDataDummy() {
        friendList = new ArrayList<>();

        friendList.add(new FriendListModel("10123001", "Michelle Ziudith",
                "IF-3", "081312345001", "michelleziu@gmail.com",
                "michelleziu"));
        friendList.add(new FriendListModel("10123002", "Tatjana Saphira",
                "IF-3", "081312345002", "tatjanasaphira@gmail.com",
                "tatjanasaphira"));
        friendList.add(new FriendListModel("10123003", "Natasha Wilona",
                "IF-3", "081312345003", "natashawilona@gmail.com",
                "natashawilona12"));
        friendList.add(new FriendListModel("10123004", "Mikha Tambayong",
                "IF-3", "081312345004", "mikhatambayong@gmail.com",
                "miktambayong"));
        friendList.add(new FriendListModel("10123005", "Jessica Mila",
                "IF-3", "081312345005", "jessicamila@gmail.com",
                "jscmila"));
    }
}
