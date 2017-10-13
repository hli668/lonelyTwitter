package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by qin7 on 2017/10/13.
 */

public class TweetList {
        private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

        public TweetList(){

        }

        public Tweet getTweet(int index){
            return tweets.get(index);
        }

        public boolean hasTweet(Tweet tweet){
            return tweets.contains(tweet);
        }

        public void add(Tweet tweet) {
            tweets.add(tweet);
        }

        public void delete(Tweet tweet) {
            tweets.remove(tweet);
        }

        int getCount(){
            return tweets.size();
        }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }
}
