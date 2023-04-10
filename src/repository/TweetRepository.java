package repository;

import java.util.ArrayList;
import java.util.List;

import model.Tweet;

public class TweetRepository {
  private List<Tweet> tweets = new ArrayList<>();

  public void save(Tweet tweet) {
    tweets.add(tweet);
  }

  public List<Tweet> findAllLimited(int page) {
    int endIndex = tweets.size() - (page * 5);
    int startIndex = endIndex + 4;

    if(endIndex < 0) endIndex = 0;
    if(startIndex >= tweets.size()) startIndex = tweets.size() - 1;

    List<Tweet> pageList = new ArrayList<>();

    for(int i=startIndex; i>=endIndex; i--) {
      pageList.add(tweets.get(i));
    }

    return pageList;
  }

  public List<Tweet> findAllByUser(String username) {
    List<Tweet> userTweets = new ArrayList<>();

    for(int i=tweets.size()-1; i>=0; i--) {
      if(tweets.get(i).getUsername().equals(username)) {
        userTweets.add(tweets.get(i));
      }
    }

    return userTweets;
  }
}
