package com.noah.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "diary")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int diaryId;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column
    private int pid;

    @Column
    private String content;

    @OneToOne
    @JoinColumn(name = "favouriteUserId")
    private User favouriteUser;

    @Column
    private int favouriteNum;

    @Column
    private int replayNum;

    @Column
    private int hot;

    @Column
    private String subjectImg;

    @Column(nullable = false)
    @CreationTimestamp
    private Timestamp diaryTime;

    public Diary(){

    }

    public Diary(User user, int pid, String content, User favouriteUser, int favouriteNum, int replayNum, int hot, String subjectImg, Timestamp diaryTime) {
        this.user = user;
        this.pid = pid;
        this.content = content;
        this.favouriteUser = favouriteUser;
        this.favouriteNum = favouriteNum;
        this.replayNum = replayNum;
        this.hot = hot;
        this.subjectImg = subjectImg;
        this.diaryTime = diaryTime;
    }

    public int getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(int diaryId) {
        this.diaryId = diaryId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getFavouriteUser() {
        return favouriteUser;
    }

    public void setFavouriteUser(User favouriteUser) {
        this.favouriteUser = favouriteUser;
    }

    public int getFavouriteNum() {
        return favouriteNum;
    }

    public void setFavouriteNum(int favouriteNum) {
        this.favouriteNum = favouriteNum;
    }

    public int getReplayNum() {
        return replayNum;
    }

    public void setReplayNum(int replayNum) {
        this.replayNum = replayNum;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public String getSubjectImg() {
        return subjectImg;
    }

    public void setSubjectImg(String subjectImg) {
        this.subjectImg = subjectImg;
    }

    public Timestamp getDiaryTime() {
        return diaryTime;
    }

    public void setDiaryTime(Timestamp diaryTime) {
        this.diaryTime = diaryTime;
    }
}
