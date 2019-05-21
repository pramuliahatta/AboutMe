package com.example.g_eight.aboutme.Models;

import com.example.g_eight.aboutme.R;

/**
 * Created by G-Eight on 5/21/2019.
 * 10116114
 * Hatta Pramulia
 * IF-3
 **/

public enum ModelObject {

    PROFILE(R.string.profile, R.layout.view_profile),
    CONTACTS(R.string.contacts, R.layout.view_contacts),
    FRIENDLIST(R.string.friendlist, R.layout.view_friendlist);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
