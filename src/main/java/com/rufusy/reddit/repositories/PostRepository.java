package com.rufusy.reddit.repositories;

import com.rufusy.reddit.models.Post;
import com.rufusy.reddit.models.Subreddit;
import com.rufusy.reddit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);
    List<Post> findByUser(User user);
}
