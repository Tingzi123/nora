package com.noah.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToOne
    @JoinColumn(name = "diaryId")
    private Diary diary;

    @Column
    private String content;

    @Column
    private int commentCount;

    @Column(nullable = false)
    @CreationTimestamp
    private Timestamp commentTime;
}
