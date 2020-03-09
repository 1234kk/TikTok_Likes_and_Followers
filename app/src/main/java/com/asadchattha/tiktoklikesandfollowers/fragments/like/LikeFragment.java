package com.asadchattha.tiktoklikesandfollowers.fragments.like;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asadchattha.tiktoklikesandfollowers.R;
import com.asadchattha.tiktoklikesandfollowers.fragments.earn.WatchVideosActivity;


public class LikeFragment extends Fragment {

    private CardView mCardGetLikes;
    private CardView mCardLikesList;

    public LikeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_like, container, false);

        /** Get Likes CardView */
        mCardGetLikes = root.findViewById(R.id.card_getLikes);
        mCardGetLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), GetLikesActivity.class);
                startActivity(intent);
            }
        });


        /** Likes List CardView */
        mCardLikesList = root.findViewById(R.id.card_likesList);
        mCardLikesList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), LikesListActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}
