package com.noah.repository;

import com.noah.model.Diary;
import com.noah.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary,Integer> {
    List<Diary> findDiaryByUser(User user);
}
