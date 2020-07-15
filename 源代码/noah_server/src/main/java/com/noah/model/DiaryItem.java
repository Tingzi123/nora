package com.noah.model;

import java.sql.Timestamp;

public class DiaryItem extends Diary {
    private int likeCount;
    private int commentCount;

    public DiaryItem(){

    }

    public DiaryItem(int likeCount, int commentCount) {
        this.likeCount = likeCount;
        this.commentCount = commentCount;
    }

    public DiaryItem(User user, String records, Timestamp recordTime, int likeCount, int commentCount) {
        super(user, records, recordTime);
        this.likeCount = likeCount;
        this.commentCount = commentCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
