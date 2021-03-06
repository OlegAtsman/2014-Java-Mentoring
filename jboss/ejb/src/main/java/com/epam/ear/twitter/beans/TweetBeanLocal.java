package com.epam.ear.twitter.beans;

import com.epam.ear.twitter.domain.Tweet;
import com.epam.ear.twitter.domain.User;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by alehatsman on 11/23/14.
 */
@Local
public interface TweetBeanLocal {

    public void save(Tweet tweet);

    public List<Tweet> list(int id);

    public List<Tweet> list(String username);

    public void save(String username, String text);

}
