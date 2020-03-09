package com.asadchattha.tiktoklikesandfollowers.model;

public class Follower {

    private String mDescription;
    private String mDiamondAmount;

    public Follower(String description, String diamondAmount) {
        mDescription = description;
        mDiamondAmount = diamondAmount;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getDiamondAmount() {
        return mDiamondAmount;
    }
}
