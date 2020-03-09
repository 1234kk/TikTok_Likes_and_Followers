package com.asadchattha.tiktoklikesandfollowers.fragments.comment;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asadchattha.tiktoklikesandfollowers.R;
import com.asadchattha.tiktoklikesandfollowers.fragments.like.GetLikesActivity;


public class CommentFragment extends Fragment {
    private CardView mCardGetComments;
    private CardView mCardCommentsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_comment, container, false);

        /** Get Comments CardView */
        mCardGetComments = root.findViewById(R.id.card_getComments);
        mCardGetComments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), GetCommentsActivity.class);
                startActivity(intent);
            }
        });


        /** Comments List CardView */
        mCardCommentsList = root.findViewById(R.id.card_commentsList);
        mCardCommentsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CommentsListActivity.class);
                startActivity(intent);
            }
        });


        return root;
    }

}
