package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TweterooApplication;
import dto.TweetDTO;
import model.Tweet;

@Service
public class TweetService {
  @Autowired
  private AuthService authService;

  public void create(TweetDTO tweet) {
    String avatar = authService.getUserAvatar(tweet.username());
    if(avatar.length() == 0) throw new Error("user invalid");
    TweterooApplication.tweetRepository.save(new Tweet(tweet.text(), tweet.username(), avatar));
  }

  public List<Tweet> listTweetsPage(int page) {
    return TweterooApplication.tweetRepository.findAllLimited(page);
  }

  public List<Tweet> listUserTweets(String username) {
    return TweterooApplication.tweetRepository.findAllByUser(username);
  }
}
