package com.rufusy.reddit.repositories;

import com.rufusy.reddit.models.Post;
import com.rufusy.reddit.models.User;
import com.rufusy.reddit.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
