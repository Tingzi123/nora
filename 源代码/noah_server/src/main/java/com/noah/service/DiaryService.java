package com.noah.service;

import com.noah.model.Diary;
import com.noah.model.User;

import java.util.List;

public interface DiaryService {
    List<Diary> getDairysOrderById();

    List<Diary> getDairysOrderByTime();

    List<Diary> getDairysOrderByReplayTime();

    List<Diary> getDairysOrderByReplayHot();

    List<Diary> getChildDairysByPid(int pid);

    void sendDairy(int uid,Diary diary);

    void SubmitFavourite(int uid,int diary_id);

}
