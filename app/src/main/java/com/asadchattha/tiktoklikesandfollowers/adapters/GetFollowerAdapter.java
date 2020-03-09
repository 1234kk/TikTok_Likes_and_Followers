package com.asadchattha.tiktoklikesandfollowers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.asadchattha.tiktoklikesandfollowers.R;
import com.asadchattha.tiktoklikesandfollowers.model.Follower;

import java.util.ArrayList;

public class GetFollowerAdapter extends ArrayAdapter<Follower> {

    /**
     * Resource ID for background color of this list of words
     */
    private int mImageResourceId;

    public GetFollowerAdapter(@NonNull Context context, ArrayList<Follower> follower, int imageResourceId) {
        super(context, 0, follower);
        mImageResourceId = imageResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_get_followers, parent, false);
        }

        Follower mFollower = getItem(position);

        TextView textViewDescription = listItemView.findViewById(R.id.text_view_description);
        textViewDescription.setText(mFollower.getDescription());

        TextView textViewAmount = listItemView.findViewById(R.id.text_view_amount);
        textViewAmount.setText(mFollower.getDiamondAmount());

        ImageView icon = listItemView.findViewById(R.id.image_view_icon);
        icon.setImageResource(mImageResourceId);

        return listItemView;
    }
}
