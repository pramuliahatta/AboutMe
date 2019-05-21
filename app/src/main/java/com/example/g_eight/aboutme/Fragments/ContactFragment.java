package com.example.g_eight.aboutme.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.g_eight.aboutme.R;

/**
 * Created by G-Eight on 5/19/2019.
 * 10116114
 * Hatta Pramulia
 * IF-3
 **/

public class ContactFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        Button btnPhone = view.findViewById(R.id.btn_phone);
        Button btnEmail = view.findViewById(R.id.btn_email);
        Button btnInstagram = view.findViewById(R.id.btn_instagram);
        Button btnLinkedIn = view.findViewById(R.id.btn_linkedin);
        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"08996946293"));
                startActivity(i);
            }
        });
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "hatta@email.unikom.ac.id", null));
                startActivity(Intent.createChooser(i, null));
            }
        });
        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.instagram.com/khawarhyzm"));
                startActivity(i);
            }
        });
        btnLinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.linkedin.com/in/hatta-pramulia-2a7830150"));
                startActivity(i);
            }
        });
        return view;
    }

}