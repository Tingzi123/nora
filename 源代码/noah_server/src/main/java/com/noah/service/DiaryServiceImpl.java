package com.noah.service;


import com.noah.model.Diary;
import com.noah.model.User;
import com.noah.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryServiceImpl implements DiaryService {
    @Autowired
    private DiaryRepository diaryRepository;


    @Override
    public List<Diary> getDairysOrderById() {
        List<Diary> diaryList=diaryRepository.findAll();
        return diaryList;
    }

    @Override
    public List<Diary> getDairysOrderByTime() {
        diaryRepository.findAll();
        return null;
    }

    @Override
    public List<Diary> getDairysOrderByReplayTime() {
        return null;
    }

    @Override
    public List<Diary> getDairysOrderByReplayHot() {
        return null;
    }

    @Override
    public List<Diary> getChildDairysByPid(int pid) {
        return null;
    }

    @Override
    public void sendDairy(int uid, Diary diary) {

    }

    @Override
    public void SubmitFavourite(int uid, int diary_id) {

    }
}
