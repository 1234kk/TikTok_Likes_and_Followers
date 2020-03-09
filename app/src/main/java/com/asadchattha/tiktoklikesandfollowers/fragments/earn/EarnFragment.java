package com.asadchattha.tiktoklikesandfollowers.fragments.earn;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.asadchattha.tiktoklikesandfollowers.R;

public class EarnFragment extends Fragment {

    private CardView mCardWatchVideos;
    private CardView mCardScratchAndWin;
    private CardView mCardDoLikes;
    private CardView mCardDoFollowing;
    private CardView mCardDoComment;
    private CardView mCardDoShare;
    private CardView mCardRateUs;

    public EarnFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_earn, container, false);

        /** Watch videos CardView */
        mCardWatchVideos = root.findViewById(R.id.card_watchVideos);
        mCardWatchVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WatchVideosActivity.class);
                startActivity(intent);
            }
        });


        /** Scratch and Win CardView */
        mCardScratchAndWin = root.findViewById(R.id.card_scratchAndWin);
        mCardScratchAndWin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ScratchAndWinActivity.class);
                startActivity(intent);
            }
        });


        /** Do Likes CardView */
        mCardDoLikes = root.findViewById(R.id.card_doLikes);
        mCardDoLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DoLikesActivity.class);
                startActivity(intent);
            }
        });

        /** Do Following CardView */
        mCardDoFollowing = root.findViewById(R.id.card_doFollowing);
        mCardDoFollowing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DoFollowingActivity.class);
                startActivity(intent);
            }
        });


        /** Do Comment CardView */
        mCardDoComment = root.findViewById(R.id.card_doComment);
        mCardDoComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DoCommentActivity.class);
                startActivity(intent);
            }
        });


        /** Do Share CardView */
        mCardDoShare = root.findViewById(R.id.card_doShare);
        mCardDoShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DoShareActivity.class);
                startActivity(intent);
            }
        });


        /** Rate Us CardView */
        mCardRateUs = root.findViewById(R.id.card_rateUs);
        mCardRateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RateUsActivity.class);
                startActivity(intent);
            }
        });


        return root;
    }

}
