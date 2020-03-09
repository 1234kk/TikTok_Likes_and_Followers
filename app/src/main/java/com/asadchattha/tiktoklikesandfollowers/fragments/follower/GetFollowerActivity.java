package com.asadchattha.tiktoklikesandfollowers.fragments.follower;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.asadchattha.tiktoklikesandfollowers.R;
import com.asadchattha.tiktoklikesandfollowers.adapters.GetFollowerAdapter;
import com.asadchattha.tiktoklikesandfollowers.model.Follower;

import java.util.ArrayList;

public class GetFollowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        final ArrayList<Follower> follower = new ArrayList<Follower>();
        follower.add(new Follower("Get 20 real followers in 60 diamonds.", "Get 60 Followers"));
        follower.add(new Follower("Get 40 real followers in 100 diamonds.", " Get 100 Followers"));
        follower.add(new Follower("Get 80 real followers in 180 diamonds.", "Get 180 Followers"));
        follower.add(new Follower("Get 200 real followers in 400 diamonds.", "Get 400 Followers"));
        follower.add(new Follower("Get 500 real followers in 900 diamonds.", "Get 900 Followers"));
        follower.add(new Follower("Get 1000 real followers in 1600 diamonds.", "Get 1000 Followers"));

        GetFollowerAdapter itemsAdapter = new GetFollowerAdapter(this, follower, R.drawable.ic_tiktok);

        //Access LinearLayout to add subView into that.
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
