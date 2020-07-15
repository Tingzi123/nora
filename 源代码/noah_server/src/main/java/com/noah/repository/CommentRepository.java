package com.noah.repository;

import com.noah.model.Comment;
import com.noah.model.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
    //通过diaryId获取所有评论
    public List<Comment> findCommentByDiary(Diary diary);

}
