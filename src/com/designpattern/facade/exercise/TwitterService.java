package com.designpattern.facade.exercise;

import java.util.List;

public class TwitterService {
    private String appKey;
    private String secret;

    public TwitterService(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public String getAuthToken() {
        OAuth oauth = new OAuth();
        String requestToken = oauth.requestToken(appKey, secret);
        return oauth.getAccessToken(requestToken);
    }

    public List<Tweet> getRecentTweets() {
        TwitterClient twitterClient = new TwitterClient();
        List<Tweet> tweets = twitterClient.getRecentTweets(this.getAuthToken());
        return tweets;
    }
}
