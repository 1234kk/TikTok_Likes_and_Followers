package com.asadchattha.tiktoklikesandfollowers.fragments.like;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.asadchattha.tiktoklikesandfollowers.R;
import com.asadchattha.tiktoklikesandfollowers.adapters.GetFollowerAdapter;
import com.asadchattha.tiktoklikesandfollowers.model.Follower;

import java.util.ArrayList;


public class GetLikesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Follower> follower = new ArrayList<>();
        follower.add(new Follower("Get 20 real likes in 60 diamonds.", "Get 60 Likes"));
        follower.add(new Follower("Get 40 real likes in 100 diamonds.", " Get 100 Likes"));
        follower.add(new Follower("Get 80 real likes in 180 diamonds.", "Get 180 Likes"));
        follower.add(new Follower("Get 200 real likes in 400 diamonds.", "Get 400 Likes"));
        follower.add(new Follower("Get 500 real likes in 900 diamonds.", "Get 500 Likes"));
        follower.add(new Follower("Get 1000 real likes in 1600 diamonds.", "Get 1000 Likes"));

        GetFollowerAdapter itemsAdapter = new GetFollowerAdapter(this, follower, R.drawable.ic_heart_black_24dp);

        //Access LinearLayout to add subView into that.
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
