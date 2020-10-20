package com.rufusy.reddit.repositories;

import com.rufusy.reddit.models.Comment;
import com.rufusy.reddit.models.Post;
import com.rufusy.reddit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
    List<Comment> findAllByPost(Post post);
    List<Comment> findByUser(User user);
    List<Comment> findAllByUser(User user);
}
