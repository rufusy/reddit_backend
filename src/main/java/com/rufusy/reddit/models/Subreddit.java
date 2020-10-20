package com.rufusy.reddit.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "subreddits")
public class Subreddit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subredditId;

    @NotEmpty(message="Community name is required")
    private String name;

    @NotEmpty(message="Description is required")
    private String description;

    private Instant createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId", foreignKey = @ForeignKey(name = "fk_subreddits_users_userId"))
    private User user;

    @OneToMany(mappedBy = "subreddit", fetch = FetchType.LAZY)
    private List<Post> posts;
}
