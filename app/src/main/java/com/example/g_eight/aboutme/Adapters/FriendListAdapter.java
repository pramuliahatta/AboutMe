package com.example.g_eight.aboutme.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.g_eight.aboutme.Models.FriendListModel;
import com.example.g_eight.aboutme.R;

import java.util.List;

/**
 * Created by G-Eight on 5/20/2019.
 * 10116114
 * Hatta Pramulia
 * IF-3
 **/

public class FriendListAdapter extends BaseAdapter {

    private Context mContext;
    private List<FriendListModel> mFriendList;

    public FriendListAdapter(Context mContext, List<FriendListModel> mFriendList) {
        this.mContext = mContext;
        this.mFriendList = mFriendList;
    }

    @Override
    public int getCount() {
        return mFriendList.size();
    }

    @Override
    public Object getItem(int i) {
        return mFriendList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_friend_list, null);
        TextView tvName = v.findViewById(R.id.tv_name);
//        TextView tvStudentID = v.findViewById(R.id.tv_sid);
//        TextView tvClass = v.findViewById(R.id.tv_class);
//        TextView tvPhone = v.findViewById(R.id.tv_phone);
//        TextView tvEmail = v.findViewById(R.id.tv_email);
//        TextView tvSocMed = v.findViewById(R.id.tv_socmed);

        tvName.setText(mFriendList.get(i).getName());
//        tvStudentID.setText(mFriendList.get(i).getStudentId());
//        tvClass.setText(mFriendList.get(i).getClassRoom());
//        tvPhone.setText(mFriendList.get(i).getPhoneNumber());
//        tvEmail.setText(mFriendList.get(i).getEmail());
//        tvSocMed.setText(mFriendList.get(i).getSocialMedia());


        return v;
    }

}
