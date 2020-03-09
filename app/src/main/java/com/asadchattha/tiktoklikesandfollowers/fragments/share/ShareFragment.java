package com.asadchattha.tiktoklikesandfollowers.fragments.share;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asadchattha.tiktoklikesandfollowers.R;
import com.asadchattha.tiktoklikesandfollowers.fragments.like.GetLikesActivity;


public class ShareFragment extends Fragment {

    private CardView mCardGetShare;
    private CardView mCardShareList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_share, container, false);

        /** Get Share CardView */
        mCardGetShare = root.findViewById(R.id.card_getShare);
        mCardGetShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), GetShareActivity.class);
                startActivity(intent);
            }
        });


        /** Get Share CardView */
        mCardShareList = root.findViewById(R.id.card_shareList);
        mCardShareList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ShareListActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }

}
